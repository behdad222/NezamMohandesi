package ir.rima.mohandesi.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

import java.lang.reflect.Method;

public class ShowActivity extends Activity {

    WebView webView;
    String keyword;
    EditText searchText;
    String word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        String value = getIntent().getStringExtra("fasl");

        searchText = (EditText) findViewById(R.id.textSearch);
        webView = (WebView) findViewById(R.id.webView);
        webView.setScrollbarFadingEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.clearCache(true);
        webView.loadUrl("file:///android_asset/www/fasl"+value+".html");
    }

    public void next (View view) {
        word = searchText.getText().toString();

        if (word.equals(keyword)) {
            webView.findNext(true);
        } else {
            keyword = word;
            webView.findAll(keyword);
            try {
                Method m = WebView.class.getMethod("setFindIsUp", Boolean.TYPE);
                m.invoke(webView, true);
            } catch (Throwable ignored) {
            }
        }
    }

    public void Previous (View view) {
        word = searchText.getText().toString();

        if (word.equals(keyword)) {
            webView.findNext(false);
        } else {

            keyword = word;
            webView.findAll(keyword);
            try {
                Method m = WebView.class.getMethod("setFindIsUp", Boolean.TYPE);
                m.invoke(webView, true);
            } catch (Throwable ignored) {
            }
        }
    }
}
