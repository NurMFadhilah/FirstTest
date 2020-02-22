package com.example.firsttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.widget.TextView.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.btnlogin);
        final EditText username = (EditText) findViewById(R.id.username);

        login.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String input = username.getText().toString();
                    Intent intent = new Intent(MainActivity.this, SecondPage.class);
                    intent.putExtra("data", input);
                    startActivity(intent);
        }
    });
}

}
