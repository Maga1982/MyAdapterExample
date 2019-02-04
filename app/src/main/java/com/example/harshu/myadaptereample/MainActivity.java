package com.example.harshu.myadaptereample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import com.example.harshu.myadaptereample.Earthquake;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Earthquake> earthquakeArrayList = new ArrayList<Earthquake>();
        earthquakeArrayList.add(new Earthquake(8,"Japan",4));
        earthquakeArrayList.add(new Earthquake(9,"China",5));
        earthquakeArrayList.add(new Earthquake(10,"Indonesia",6));
        earthquakeArrayList.add(new Earthquake(11,"India",7));
        earthquakeArrayList.add(new Earthquake(12,"London",8));
        EarthquakeAdapter myAdapter = new EarthquakeAdapter(this,earthquakeArrayList);
        ListView myListView = findViewById(R.id.my_list);
        myListView.setAdapter(myAdapter);


    }
}
