package com.example.dajuanzhancf;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void home(View view) {
        Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent1);
    }

    public void dashboard(View view) {
        Intent intent2 = new Intent(MainActivity.this,Dashboard.class);
        startActivity(intent2);
    }

    public void gotocomment(View view) {
        Intent intent = new Intent(MainActivity.this, comment.class);
        startActivity(intent);
    }

    public void account(View view) {
        Intent intent4 = new Intent(MainActivity.this,account.class);
        startActivity(intent4);
    }

    public void gotocreate(View view) {
        Intent intent = new Intent(MainActivity.this, create.class);
        startActivity(intent);
    }

    public void author(View view) {
        Intent intent6 = new Intent(MainActivity.this,author.class);
        startActivity(intent6);
    }

    public void zun(View view) {
        Intent intent = new Intent(MainActivity.this,zun.class);
        startActivity(intent);
    }

    public void pigsleg(View view) {
        Intent intent = new Intent(MainActivity.this,pigsleg_author.class);
        startActivity(intent);
    }

    public void zhengfu(View view) {
        Intent intent = new Intent(MainActivity.this,zhengfu.class);
        startActivity(intent);
    }

    public void slide(View view) {
        DrawerLayout drawerlayout = findViewById(R.id.drawerLayout);
        drawerlayout.openDrawer(GravityCompat.START);
    }
}