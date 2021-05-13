package com.example.mobilemuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registeration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
    }

    public void sendMessage(View view){

    }

    public void gotologin(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    public void gotolog(View view) {
        EditText fnam, pnumber, mail, unam, upw;
        fnam= findViewById(R.id.fulname);
        pnumber = findViewById(R.id.phon);
        mail = findViewById(R.id.uemail);
        unam = findViewById(R.id.uname);
        upw = findViewById(R.id.pwd);
        if(fnam.getText().toString().isEmpty() || pnumber.getText().toString().isEmpty()
                || mail.getText().toString().isEmpty()
                || unam.getText().toString().isEmpty()
                || upw.getText().toString().isEmpty()){
            Toast.makeText(Registeration.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(Registeration.this, "Thank you for registering with us", Toast.LENGTH_SHORT).show();
        Intent intnt = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intnt);
        }

    }
}