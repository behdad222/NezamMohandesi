package ir.rima.mohandesi.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        webView = (WebView) findViewById(R.id.webView);
        webView.setScrollbarFadingEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.clearCache(true);


        webView.loadUrl("file:///android_asset/www/index.html");
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

        Button search = (Button) findViewById(R.id.butSearch);
        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //set up button for search keyword of the webView
                final Dialog dSearch = new Dialog(activity);
                dSearch.setContentView(R.layout.search_keyword);
                dSearch.setCancelable(true);
                dSearch.setTitle("xcxc");

                Button cancel = (Button) dSearch.findViewById(R.id.searchCancel);
                cancel.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dSearch.dismiss();
                    }
                });

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
        });


    }

}
