package com.example.firsttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondPage extends AppCompatActivity{

    public static final String AddUsername = "Add_Username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        TextView tvData = (TextView) findViewById(R.id.tvData);

        Intent dataIntent = getIntent();
        String data = dataIntent.getStringExtra("data");

        if(data.equals("")) {
            data = "tidak ada data yang di inputkan";
        }

        tvData.setText(data);

    }


}
