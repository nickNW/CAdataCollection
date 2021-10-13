package com.example.cadatacollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Task3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_university_of_south_florida_seal);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

}