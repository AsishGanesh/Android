package com.example.ganesh.thalathalapathies;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        populateListView();

    }

    public void populateListView() {
        String[] TeamVasanth = {"Vasanth", "Asish", "SriRam", "Nikhil", "Anushya", "Nishant"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.items, R.id.textview, TeamVasanth);
        ListView list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:
                Toast.makeText(this, "Clicked Vasanth ", Toast.LENGTH_SHORT).show();
                Intent vasanth = new Intent(getApplicationContext(), vasanth.class);
                startActivity(vasanth);
                break;
            case 1:
                Toast.makeText(this, "Clicked Asish", Toast.LENGTH_SHORT).show();
                Intent asish = new Intent(getApplicationContext(), asish.class);
                startActivity(asish);
                break;
            case 2:
                Toast.makeText(this, "Clicked SriRam", Toast.LENGTH_SHORT).show();
                Intent SriRam = new Intent(getApplicationContext(), SriRam.class);
                startActivity(SriRam);
                break;
            case 3:
                Toast.makeText(this, "Clicked Nikhil", Toast.LENGTH_SHORT).show();
                Intent Nikhil = new Intent(getApplicationContext(), Nikhil.class);
                startActivity(Nikhil);

                break;
            case 4:
                Toast.makeText(this, "Clicked Anushya", Toast.LENGTH_SHORT).show();
                Intent Anushya = new Intent(getApplicationContext(), Anushya.class);
                startActivity(Anushya);

                break;
            case 5:
                Toast.makeText(this, "Clicked Nishant", Toast.LENGTH_SHORT).show();
                Intent Nishant = new Intent(getApplicationContext(), Nishant.class);
                startActivity(Nishant);

                break;
            case 6:
                Toast.makeText(this, "Sorry Team leader data can't be show in app,its huge", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}