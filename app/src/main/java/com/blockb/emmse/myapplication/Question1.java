package com.blockb.emmse.myapplication;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;


public class Question1 extends Activity {
    private int day;
    private int month;
    private int year;
    private EditText text;
    private DatePickerDialog cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        text = (EditText)findViewById(R.id.q1_dateEditText);
        text.setFocusable(false);
        text.setInputType(InputType.TYPE_NULL);

        text.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Implemented datepicker here
                Calendar selectedDate = Calendar.getInstance();
                year = selectedDate.get(Calendar.YEAR);
                month = (int) (Math.random()*11) + 1;
                day = (int) (Math.random()*28) + 1;

                DatePickerDialog datePickerDialog = new DatePickerDialog(Question1.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        monthOfYear += 1;
                        text.setText(dayOfMonth+"/"+monthOfYear+"/"+year);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        Button start = (Button)findViewById(R.id.submit);
        start.setOnClickListener(
                new android.widget.Button.OnClickListener(){
                    public void onClick(View v){
                        //Task 1: Get the date and season and do validation

                        //After validation
                        Intent intent = new Intent();
                        //pass to next activity
                        intent.setClass(Question1.this, Question2.class);
                        startActivity(intent);
                        Question1.this.finish();

                    }
                }
        );
    }

}
