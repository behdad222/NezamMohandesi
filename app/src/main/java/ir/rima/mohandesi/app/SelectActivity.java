package ir.rima.mohandesi.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void ShowClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        startActivity(i);
    }
}
