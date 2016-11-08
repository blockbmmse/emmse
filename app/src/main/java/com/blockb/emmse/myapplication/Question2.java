package com.blockb.emmse.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Button start = (Button)findViewById(R.id.submit);
        start.setOnClickListener(
                new android.widget.Button.OnClickListener(){
                    public void onClick(View v){
                        //Task 1: Get the date and season and do validation

                        //After validation
                        Intent intent = new Intent();
                        //pass to next activity
                        intent.setClass(Question2.this, Question3.class);
                        startActivity(intent);
                        Question2.this.finish();

                    }
                }
        );
    }


}
