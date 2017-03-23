package com.example.ganesh.thalathalapathies;

/**
 * Created by Ganesh on 22-03-2017.
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;



public class SriRam extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sriram);
    }


    public void buttonsriram(View v) {
          try {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                  "https://www.facebook.com/chabbuk?fref=ts"));
          startActivity(browserIntent);
         } catch (Exception e) {
        Toast.makeText(this, "Update your app", Toast.LENGTH_SHORT).show();
        //     startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/")));
         }

    }
}
