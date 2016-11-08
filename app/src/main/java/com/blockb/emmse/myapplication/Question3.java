package com.blockb.emmse.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Thomas on 11/6/2016.
 */

public class Question3 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        Button start = (Button)findViewById(R.id.submit);
        start.setOnClickListener(
                new android.widget.Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //Task 1: Get the date and season and do validation

                        //After validation
                        Intent intent = new Intent();
                        //pass to next activity
                        intent.setClass(Question3.this, Question3.class);
                        startActivity(intent);
                        Question3.this.finish();

                    }
                }
        );
    }
}
