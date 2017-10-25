package com.example.thucu.htmlfiledemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView _webviewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadInit();
        loadWebviewSetting();
        loadWebview("file:///android_asset/www/index.html");

    }

    private void loadWebview(String url) {
        _webviewMain.loadUrl(url);
//        _webviewMain.addJavascriptInterface(new JavascriptInterface(this), "Android");

    }

    private void loadWebviewSetting() {
        WebSettings webSettings = _webviewMain.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.getCacheMode();
        webSettings.setLoadsImagesAutomatically(true);
//        webSettings.setScrollBarStyle();
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);

        webSettings.setSupportZoom(true);
//        webSettings.setBuiltInZoomControls(true);
//
//        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB) {
//            // Hide the zoom controls for HONEYCOMB+
//            webSettings.setDisplayZoomControls(false);
//        }
    }


    private void loadInit() {
        _webviewMain = (WebView) findViewById(R.id.webviewMain);

    }
}
