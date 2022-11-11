package com.example.activitylatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pindah(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void pindah2(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
    public void pindah3(View view) {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
    public void pindah4(View view) {
        Intent intent = new Intent(this,ActivityLast.class);
        startActivity(intent);
    }



}