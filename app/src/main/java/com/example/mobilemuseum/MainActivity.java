package com.example.mobilemuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
   public static final String EXTRA_MESSGE="com.example.mobile museum.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent= new Intent(this, DisplayMessageActivity.class);
        EditText editText=(EditText)findViewById(R.id.editText);
        String Message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE ,Message);
        startActivity(intent);
    }

    public void gotoregister(View view) {
        Intent intent = new Intent(getApplicationContext(),Registeration.class);
        startActivity(intent);
    }

    public void gotohome(View view) {
        Intent intent = new Intent(getApplicationContext(),Home.class);
        startActivity(intent);
    }

    public void gotoforgotpassword(View view) {
        Intent intent =  new Intent(getApplicationContext(),ForgotPassword.class);
        startActivity(intent);
    }

    private class DisplayMessageActivity {
    }
}