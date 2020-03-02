package com.example.habibasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity  {
    private Button button;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        EditText email= findViewById(R.id.etEmail);
        EditText password= findViewById(R.id.etPassword);
        */

        progressBar = new ProgressBar(MainActivity.this);

        progressBar= findViewById(R.id.loading);
        progressBar.setVisibility(View.GONE);
        button=(Button)findViewById(R.id.etButton);
        button.setOnClickListener (new View.OnClickListener() {

    public void onClick(View v) {

        openListActivity();
        }
    }
    );

}
public void openListActivity(){
    progressBar.setVisibility(View.VISIBLE);
        Intent i = new Intent(MainActivity.this, ListActivity.class);
        startActivity(i);
        //progressBar.setVisibility(View.INVISIBLE);

    }

}

