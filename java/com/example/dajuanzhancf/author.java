package com.example.dajuanzhancf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class author extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
        WebView zun = findViewById(R.id.zun);
        zun.loadUrl("https://dajuanzhan.cf/?cate=58");
        WebSettings settings = zun.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        zun.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        zun.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        WebView zhengfu = findViewById(R.id.zhengfu);
        zhengfu.loadUrl("https://dajuanzhan.cf/?cate=25");
        WebSettings settings1 = zhengfu.getSettings();
        settings1.setJavaScriptEnabled(true);
        settings1.setDomStorageEnabled(true);
        zhengfu.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        zhengfu.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        WebView pigsleg = findViewById(R.id.pigsleg);
        pigsleg.loadUrl("https://dajuanzhan.cf/?cate=25");
        WebSettings settings2 = zhengfu.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setDomStorageEnabled(true);
        pigsleg.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String s1, String s2, String s3, long l) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        pigsleg.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }

    public void back_to_dashboard(View view) {
        Intent intent = new Intent(author.this,MainActivity.class);
        startActivity(intent);
    }

    public void zun(View view) {
        Intent intent = new Intent(author.this,zun.class);
        startActivity(intent);
    }

    public void zhengfu(View view) {
        Intent intent = new Intent(author.this,zhengfu.class);
        startActivity(intent);
    }

    public void about_zun(View view) {
        Intent intent = new Intent(author.this,math.class);
        startActivity(intent);
    }

    public void about_zhengfu(View view) {
        Intent intent = new Intent(author.this,develop.class);
        startActivity(intent);
    }

    public void pigsleg_author(View view) {
        Intent intent = new Intent(author.this,pigsleg_author.class);
        startActivity(intent);
    }

    public void about_pigsleg(View view) {
        Intent intent = new Intent(author.this,pigsleg.class);
        startActivity(intent);
    }

    public void be_an_author(View view) {
        Intent intent = new Intent(author.this,be_an_author.class);
        startActivity(intent);
    }
}