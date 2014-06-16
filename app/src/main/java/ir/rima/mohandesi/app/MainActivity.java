package ir.rima.mohandesi.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* final ActionBar actionBar = getActionBar();
        actionBar.setCustomView(R.layout.actionbar_custom);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);*/

        String fontPath = "fonts/BYekan.ttf";
        button = (Button) findViewById(R.id.ListButton);
        Typeface font = Typeface.createFromAsset(getAssets(), fontPath);
        button.setTypeface(font);

        button = (Button) findViewById(R.id.SelectButton);
        button.setTypeface(font);

        button = (Button) findViewById(R.id.SourceButton);
        button.setTypeface(font);

        button = (Button) findViewById(R.id.AboutButton);
        button.setTypeface(font);

        button = (Button) findViewById(R.id.ContactButton);
        button.setTypeface(font);
    }

    public void ListClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ListActivity.class);
        startActivity(i);
    }

    public void SelectClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.SelectActivity.class);
        startActivity(i);
    }

    public void SourceClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.SelectActivity.class);
        startActivity(i);
    }

    public void AboutClick(View view) {
        LayoutInflater factory = LayoutInflater.from(this);
        final View DialogView = factory.inflate(R.layout.dialog, null);
        final AlertDialog Dialog = new AlertDialog.Builder(this).create();
        Dialog.setView(DialogView);
        TextView textDialog;
        if (DialogView != null) {
            textDialog = (TextView) DialogView.findViewById(R.id.txt_dialog);
            textDialog.setText(getString(R.string.txt_about));
        }
        Dialog.show();
    }

    public void ContactClick(View view) {
        LayoutInflater factory = LayoutInflater.from(this);
        final View DialogView = factory.inflate(R.layout.dialog, null);
        final AlertDialog Dialog = new AlertDialog.Builder(this).create();
        Dialog.setView(DialogView);
        TextView textDialog;
        if (DialogView != null) {
            textDialog = (TextView) DialogView.findViewById(R.id.txt_dialog);
            textDialog.setText(getString(R.string.txt_contact));
        }
        Dialog.show();
    }
}
