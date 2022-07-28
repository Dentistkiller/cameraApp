package com.example.splash1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_screen);
    }
    public  void toCam (View view)
    {
        Intent intent = new Intent(AboutScreen.this, Camera.class);
        startActivity(intent);
    }
}