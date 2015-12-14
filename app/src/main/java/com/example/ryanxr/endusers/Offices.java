package com.example.ryanxr.endusers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by kappie on 14-12-2015.
 */
public class Offices extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offices_layout);

    String[] myStringArray={"Delft", "Den Haag", "Rotterdam", "Groningen", "Utrecht"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, myStringArray);
    ListView officeslist = (ListView) findViewById(R.id.offices_list);
    officeslist.setAdapter(adapter);
    }

    public void OpenOffice(View view) {
        Intent openOffice = new Intent(this, OfficeDetails.class);
        startActivity(openOffice);
    }
}
