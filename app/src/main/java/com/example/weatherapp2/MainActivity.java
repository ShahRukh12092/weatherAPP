package com.example.weatherapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView date_view;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;
    private ImageButton button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        date_view=findViewById(R.id.textView_date);
        calendar =Calendar.getInstance();
        dateFormat= new SimpleDateFormat("dd,MMMM,YYYY",Locale.ENGLISH);
        date =dateFormat.format(calendar.getTime());
        date_view.setText(date);


        button= findViewById(R.id.addBtn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
            }
        });

        }

}
