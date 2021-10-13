package com.example.cadatacollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_university_of_south_florida_seal);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    public void submitTask2(View view) {
        Intent intent = new Intent(this, Task3Activity.class);
        startActivity(intent);
    }
}