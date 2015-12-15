package com.example.ryanxr.endusers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by kappie on 14-12-2015.
 */
public class Offices extends Activity {
    public int Pos;
    Office[] items = {
            new Office(611111111, "Milk", "Rotterdamseweg 137, Delft"),
            new Office(622222222, "Butter", "Rotterdamseweg 138, Delft"),
            new Office(633333333, "Yogurt", "Rotterdamseweg 139, Delft"),
            new Office(644444444, "Toothpaste", "Rotterdamseweg 140, Delft"),
            new Office(655555555, "Ice Cream", "Rotterdamseweg 141, Delft"),
    };
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offices_layout);

        ArrayAdapter<Office> adapter = new ArrayAdapter<Office>(this, android.R.layout.simple_list_item_1, android.R.id.text1, items);
        final ListView officeslist = (ListView) findViewById(R.id.offices_list);
        officeslist.setAdapter(adapter);


        officeslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pos = position;
                OpenOffice(officeslist);
            }
        });
    }
    public void OpenOffice(View view) {
        Intent openOffice = new Intent(this, OfficeDetails.class);
        Bundle b = new Bundle();
        b.putInt("tel", items[Pos].getTel());
        b.putString("name", items[Pos].getName());
        b.putString("address", items[Pos].getAddress());
        openOffice.putExtras(b); //Put your id to your next Intent
        startActivity(openOffice);
    }
}
