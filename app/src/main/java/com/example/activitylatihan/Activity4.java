package com.example.activitylatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


    }

    public void pindah4(View view) {
        Intent intent = new Intent(this,ActivityLast.class);
        startActivity(intent);        }
}