package com.example.habibasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import android.content.Intent;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ListView list = findViewById(R.id.List);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("iphone");
        arrayList.add("Windows");
        arrayList.add("Blackberry");
        arrayList.add("Linux");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) list.getItemAtPosition(position);
                Toast.makeText(ListActivity.this,clickedItem,Toast.LENGTH_LONG).show();
                //move to next activity
                Intent i = new Intent(ListActivity.this, DeviceDetailActivity.class);
                startActivity(i);
            }
        });

    }



    }




