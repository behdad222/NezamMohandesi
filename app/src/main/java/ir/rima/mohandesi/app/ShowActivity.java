package ir.rima.mohandesi.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Method;

public class ShowActivity extends Activity {

    WebView webView;
    final Activity activity = this;
    ProgressDialog progressDialog;
    String keyword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        String value = getIntent().getStringExtra("fasl");

        webView = (WebView) findViewById(R.id.webView);
        webView.setScrollbarFadingEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.clearCache(true);


        webView.loadUrl("file:///android_asset/www/fasl"+value+".html");
/*
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                progressDialog.setCanceledOnTouchOutside(true);
                progressDialog.setTitle("Loading Web Page");
                progressDialog.setIcon(R.drawable.icon);
                progressDialog.setButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        webView.destroy();
                        finish();
                    }
                });
                progressDialog.show();
                progressDialog.setProgress(0);
                activity.setProgress(progress * 1000);
                progressDialog.incrementProgressBy(progress);
                if (progress == 100 && progressDialog.isShowing())
                    progressDialog.dismiss();
            }
        });*/


  /*      Button search = (Button) findViewById(R.id.butSearch);
        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //set up button for search keyword of the webView
                final Dialog dSearch = new Dialog(activity);
                dSearch.setContentView(R.layout.search_keyword);
                dSearch.setCancelable(true);
                dSearch.setTitle("xcxc");


                Button search = (Button) dSearch.findViewById(R.id.searchAdd);
                search.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        EditText etkw = (EditText) dSearch.findViewById(R.id.searchword);
                        String keyword = etkw.getText().toString();
                        dSearch.dismiss();
                        webView.findAll(keyword);
                        try
                        {
                            Method m = WebView.class.getMethod("setFindIsUp", Boolean.TYPE);
                            m.invoke(webView, true);
                        }
                        catch (Throwable ignored){}
                    }
                });
                dSearch.show();
            }
        });*/


    }

    public void next (View view) {
        EditText etkw = (EditText) findViewById(R.id.textSearch);
        String word;
        word = etkw.getText().toString();

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
        EditText etkw = (EditText) findViewById(R.id.textSearch);
        String word;
        word = etkw.getText().toString();

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
