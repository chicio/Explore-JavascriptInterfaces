package it.chicio.explorejavascriptinterfaces;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView formWebView = findViewById(R.id.webview);
        formWebView.getSettings().setJavaScriptEnabled(true);
        formWebView.addJavascriptInterface(new FormJavascriptInterface(this), "Android");
        formWebView.loadUrl("file:///android_asset/form.html");
    }
}
