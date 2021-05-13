package com.example.mobilemuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivityc<message> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message_activityc);
    }
    Intent intent=getIntent();
    String message= intent.getStringExtra(MainActivity.EXTRA_MESSGE);
//    TextView textView= findViewById(R.id.textView);
    //textView.setText(message);
}