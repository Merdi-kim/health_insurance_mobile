package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class HomeActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void goToDuePayments(View view) {

    }

    public void goToMaps(View view) {
        setContentView(R.layout.google_maps);
    }

    public void goToProfile(View view) {
        setContentView(R.layout.profile);
    }

    public void goToHistory(View view) {

    }

    public void goToPassCodeGeneration(View view) {

    }

}

