package com.example.dajuanzhancf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        WebView account = findViewById(R.id.account);
        account.setWebChromeClient(new WebChromeClient());
        WebSettings settings = account.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        account.loadUrl("https://dajuanzhan.cf/zb_system/admin/");
        account.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }

    public void back_to_home(View view) {
        Intent intent = new Intent(account.this, MainActivity.class);
        startActivity(intent);
    }

    public void rules(View view) {
        Intent intent = new Intent(account.this, rules.class);
        startActivity(intent);
    }
}