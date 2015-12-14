package com.example.ryanxr.endusers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by kappie on 14-12-2015.
 */
public class OfficeDetails extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_detail_layout);
    }
    public void Return(View view) {
        Intent goback = new Intent(this, MainActivity.class);
        startActivity(goback);
    }
}
