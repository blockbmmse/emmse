package com.blockb.emmse.myapplication;
//-----------------------
//Cover page
//-----------------------
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button start = (Button)findViewById(R.id.start);
        start.setOnClickListener(
                //Anonymous class of Button
                new android.widget.Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent();
                        //pass to next activity
                        intent.setClass(MainActivity.this, Question1.class);
                        startActivity(intent);
                        MainActivity.this.finish();
                    }
                }
        );
    }

}
