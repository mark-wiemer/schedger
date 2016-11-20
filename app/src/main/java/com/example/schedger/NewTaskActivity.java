package com.example.schedger;

import android.app.ProgressDialog;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.util.Date;

public class NewTaskActivity extends AppCompatActivity {
    public static EditText taskNameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        ImageButton saveTaskButton = (ImageButton)findViewById(R.id.saveTaskButton);
        saveTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText taskNameEdit = (EditText) findViewById(R.id.taskNameEdit);
                EditText taskStartDayEdit = (EditText) findViewById(R.id.taskStartDayEdit);
                EditText taskStartMonthEdit = (EditText) findViewById(R.id.taskStartMonthEdit);
                EditText taskStartYearEdit = (EditText) findViewById(R.id.taskStartYearEdit);
                EditText taskStartMinuteEdit = (EditText) findViewById(R.id.taskStartMinuteEdit);
                EditText taskStartHourEdit = (EditText) findViewById(R.id.taskStartHourEdit);
                EditText taskEndDayEdit = (EditText) findViewById(R.id.taskEndDayEdit);
                EditText taskEndMonthEdit = (EditText) findViewById(R.id.taskEndMonthEdit);
                EditText taskEndYearEdit = (EditText) findViewById(R.id.taskEndYearEdit);
                EditText taskEndMinuteEdit = (EditText) findViewById(R.id.taskEndMinuteEdit);
                EditText taskEndHourEdit = (EditText) findViewById(R.id.taskEndHourEdit);
                EditText taskDurationEdit = (EditText) findViewById(R.id.taskDurationEdit);

                DateTime startDate = new DateTime(
                        Integer.parseInt(taskStartYearEdit.getText().toString()),
                        Integer.parseInt(taskStartMonthEdit.getText().toString()),
                        Integer.parseInt(taskStartDayEdit.getText().toString()),
                        Integer.parseInt(taskStartHourEdit.getText().toString()),
                        Integer.parseInt(taskStartMinuteEdit.getText().toString()));
                DateTime endDate = new DateTime(
                        Integer.parseInt(taskEndYearEdit.getText().toString()),
                        Integer.parseInt(taskEndMonthEdit.getText().toString()),
                        Integer.parseInt(taskEndDayEdit.getText().toString()),
                        Integer.parseInt(taskEndHourEdit.getText().toString()),
                        Integer.parseInt(taskEndMinuteEdit.getText().toString()));
                Duration duration = new Duration(Integer.parseInt(taskDurationEdit.getText().toString()));

                Task newTask = new Task(taskNameEdit.getText().toString(), startDate,
                        endDate, duration);
                Intent tasks_intent = new Intent(NewTaskActivity.this,MainActivity.class);
                startActivity(tasks_intent );
            }
        });
    }

    static void saveTask(View v)
    {
        // validate task


        // show dialog box if invalid
        // quit method
        // save to planner
        // return to previous screen
        // display "task saved" notification
    }
}
