package com.example.ryanxr.endusers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kappie on 14-12-2015.
 */
public class OfficeDetails extends Activity {
    int tel;
    String name;
    String address;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_detail_layout);

        Bundle b = getIntent().getExtras();
        tel = b.getInt("tel");
        name = b.getString("name");
        address = b.getString("address");

        TextView telText = (TextView)findViewById(R.id.telText);
        telText.setText(String.valueOf(tel));

        TextView nameText = (TextView)findViewById(R.id.OfficeName);
        nameText.setText(name);

        TextView addressText = (TextView)findViewById(R.id.addressText);
        addressText.setText(address);

    }
    public void Return(View view) {
        Intent goback = new Intent(this, MainActivity.class);
        startActivity(goback);
    }

    public void CallOffice(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+31" + String.valueOf(tel)));
        startActivity(intent);
    }
    public void MapsOffice(View view) {
        String url = "http://maps.google.com/maps?daddr="+address;
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(intent);
    }
}
