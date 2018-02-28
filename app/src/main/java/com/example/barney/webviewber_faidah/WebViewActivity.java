package com.example.barney.webviewber_faidah;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.webkit.WebView;

import com.example.barney.webviewber_faidah.fragment.FragmentUstadz;


public class WebViewActivity extends Activity {

    WebView webView;
    BottomNavigationView view;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://yufid.tv/");

        view = findViewById(R.id.navigation);
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.mHome:
                        selectedFragment = new FragmentHome();
                        break;
                    case R.id.mUstadz:
                        selectedFragment = new FragmentUstadz();
                        break;
                    case R.id.mBaru:
                        selectedFragment = new FragmentBaru();
                        break;
                }

                return false;
            }
        });

    }

}