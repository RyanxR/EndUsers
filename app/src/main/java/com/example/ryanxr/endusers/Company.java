package com.example.ryanxr.endusers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by kappie on 14-12-2015.
 */
public class Company extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_layout);
    }
    public void goToWebsite (View view) {
        Uri uriUrl = Uri.parse("http://www.nu.nl/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}