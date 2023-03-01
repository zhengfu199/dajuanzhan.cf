package com.example.dajuanzhancf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class be_an_author extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_an_author);
    }

    public void back_to_author(View view) {
        Intent intent = new Intent(be_an_author.this,author.class);
        startActivity(intent);
    }
}