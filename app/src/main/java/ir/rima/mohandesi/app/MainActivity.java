package ir.rima.mohandesi.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ListClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ListActivity.class);
        startActivity(i);
    }

    public void SelectClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.SelectActivity.class);
        startActivity(i);
    }
}
