package com.example.ryanxr.endusers;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // Tab for Company
        TabSpec company = tabHost.newTabSpec("Company");
        // setting Title for the Tab
        company.setIndicator("Company");
        Intent photosIntent = new Intent(this, Company.class);
        company.setContent(photosIntent);

        // Tab for Offices
        TabSpec offices = tabHost.newTabSpec("Offices");
        offices.setIndicator("Offices");
        Intent songsIntent = new Intent(this, Offices.class);
        offices.setContent(songsIntent);

        tabHost.addTab(company); // Adding photos tab
        tabHost.addTab(offices);

        String[] offices_array = {"Delft", "Den Haag"};
    }
}
