package com.example.scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(this);
        Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(this);
        Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(this);
        Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(this);
        Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(this);
        Button b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(this, "This is First Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "This is Second Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "This is Third Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "This is Fourth Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "This is Fifth Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button6:
                Toast.makeText(this, "This is Sixth Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button7:
                Toast.makeText(this, "This is Seventh Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button8:
                Toast.makeText(this, "This is Eighth Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.button9:
                Toast.makeText(this, "This is Ninth Button", Toast.LENGTH_LONG).show();
                break;
                case R.id.button10:
                Toast.makeText(this, "This is Tenth Button", Toast.LENGTH_LONG).show();
                break;

        }

    }
}
