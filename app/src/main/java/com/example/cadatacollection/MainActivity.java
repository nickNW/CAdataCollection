package com.example.cadatacollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_university_of_south_florida_seal);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    /** Called when the user taps the Send button */
    public void submitMessage(View view) {
        Intent intent = new Intent(this, Task2Activity.class);
        startActivity(intent);
    }
}