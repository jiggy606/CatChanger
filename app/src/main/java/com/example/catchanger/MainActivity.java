package com.example.catchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImage(View view) {
        Log.i("Info", "Hit!");

        ImageView image = (ImageView) findViewById(R.id.oilChange);
        image.setImageResource(R.drawable.laptop);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}