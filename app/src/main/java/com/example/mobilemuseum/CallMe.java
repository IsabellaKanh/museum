package com.example.mobilemuseum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CallMe extends AppCompatActivity {
    EditText num;
    String hello;
    Button call;
public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_me);
        button=(Button)findViewById(R.id."btn");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CallMe.this,MessageActivity.class);
                startActivity(intent);

            }
        });
        num=(EditText)findViewById(R.id.Num);
        call=(Button)findViewById(R.id.call);
        //method for calling
        call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intentc = new Intent(Intent.ACTION_CALL);
                hello=num.getText().toString();
                if (hello.trim().isEmpty()){

                   intentc.setData(Uri.parse("tel:754677787"));

                }else{
                   intentc.setData(Uri.parse("tell:"+hello));

                }
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(getApplicationContext(),"please grant permission",Toast.LENGTH_SHORT).show();
                    requestPermission();
                }
                else {
                    startActivity(intentc);
                }

            }

        });
        public void requestPermission(){
            ActivityCompat.requestPermissions(CallMe.this,new String[]{
                Manifest.permission.CALL_PHONE },1);
        }
    }
}