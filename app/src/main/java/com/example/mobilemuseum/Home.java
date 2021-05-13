package com.example.mobilemuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void gotougmuseum(View view) {
        Intent intent = new Intent(getApplicationContext(), UgMuseum.class);
    }

    public void gotomengo(View view) {
        Intent intent = new Intent(getApplicationContext(), UgMuseum.class);
    }

    public void gotosocial(View view) {
        Intent intent = new Intent(getApplicationContext(), UgMuseum.class);
    }
    public void gotogreatlakes(View view) {
        Intent intent = new Intent(getApplicationContext(), UgMuseum.class);
    }
    public void gotomartyrs(View view) {
        Intent intent = new Intent(getApplicationContext(), UgMuseum.class);
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.camr:
                //startActivity(new Intent(this, testmehere.class));
                return true;

            case R.id.SendEmail:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String ourmails[] = {"isabelkanh@gmail.com, nksumaiya586@gmail.com, sumayanagobi1@gmail.com, hazaratshuayb@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, ourmails);
                intent.putExtra(Intent.EXTRA_SUBJECT, "FORGOT PASSWORD");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello, I request for a new password since i forgot the original password");
                intent.setType("message/rfc822");
                startActivity(intent);
                return true;

            case R.id.CallMe:
                Intent Ints = new Intent(Intent.ACTION_DIAL);
                Ints.setData(Uri.parse("tel:0754857723"));
             /*   if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    Activity#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for Activity#requestPermissions for more details.
                    return TODO;
                }*/
                startActivity(Ints);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}