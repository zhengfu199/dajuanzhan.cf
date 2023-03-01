package com.example.dajuanzhancf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        WebView pigsleg = findViewById(R.id.pigsleg);
        pigsleg.loadUrl("https://www.dajuanzhan.cf/?cate=26");
        pigsleg.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        WebView math = findViewById(R.id.math);
        math.loadUrl("https://www.dajuanzhan.cf/?cate=58");
        math.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        WebView develop = findViewById(R.id.develop);
        develop.loadUrl("https://www.dajuanzhan.cf/?cate=25");
        develop.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        WebView English = findViewById(R.id.English);
        English.loadUrl("https://dajuanzhan.cf/?cate=59");
        English.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }

    public void back_to_homepage(View view) {
        Intent back_to_homepage = new Intent(Dashboard.this,MainActivity.class);
        startActivity(back_to_homepage);
    }

    public void pigsleg2(View view) {
        Intent pigsleg = new Intent(Dashboard.this, pigsleg.class);
        startActivity(pigsleg);
    }

    public void math2(View view) {
        Intent math = new Intent(Dashboard.this, com.example.dajuanzhancf.math.class);
        startActivity(math);

    }

    public void develop2(View view) {
        Intent develop = new Intent(Dashboard.this, com.example.dajuanzhancf.develop.class);
        startActivity(develop);
    }

    public void more(View view) {
        Intent more = new Intent(Dashboard.this, com.example.dajuanzhancf.more.class);
        startActivity(more);
    }

    public void English(View view) {
        Intent English = new Intent(Dashboard.this, com.example.dajuanzhancf.English.class);
        startActivity(English);
    }
}