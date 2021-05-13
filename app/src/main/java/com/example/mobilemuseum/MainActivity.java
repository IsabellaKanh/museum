package com.example.mobilemuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        EditText useremail, userpw;
    useremail= findViewById(R.id.emailtxt);
        userpw = findViewById(R.id.Passw);
        if(userpw.getText().toString().isEmpty() || useremail.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
        } else if(useremail.getText().toString().equals("Bella") && userpw.getText().toString().equals("Bella")
                || useremail.getText().toString().equals("Sumaya") && userpw.getText().toString().equals("Sumaya")
                || useremail.getText().toString().equals("Hazarat") && userpw.getText().toString().equals("Hazarat")
                || useremail.getText().toString().equals("Sumaiya") && userpw.getText().toString().equals("Sumaiya")
                || useremail.getText().toString().equals("BlueBaby") && userpw.getText().toString().equals("BlueBaby")){
            Intent intent = new Intent(getApplicationContext(),Home.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
            userpw.setText("");
            useremail.setText("");
        }


    }

    public void gotoforgotpassword(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        String ourmails[] = {"isabelkanh@gmail.com, nksumaiya586@gmail.com, sumayanagobi1@gmail.com, hazaratshuayb@gmail.com"};
        intent.putExtra(Intent.EXTRA_EMAIL, ourmails);
        intent.putExtra(Intent.EXTRA_SUBJECT, "FORGOT PASSWORD");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello, I request for a new password since i forgot the original password");
        intent.setType("message/rfc822");
        startActivity(intent);

    }

    private class DisplayMessageActivity {

    }
}