package com.foysaldev.androidclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextClock textClock;
    AnalogClock analogClock;
    DigitalClock digitalClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textClock = findViewById(R.id.TextClockid);
        analogClock = findViewById(R.id.AnalogClockid);
        digitalClock = findViewById(R.id.DigitalClockid);

        textClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "text Clock Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        analogClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "analog Clock Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        digitalClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Digital Clock Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}