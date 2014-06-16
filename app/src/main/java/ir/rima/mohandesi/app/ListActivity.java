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

public class ListActivity extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String fontPath = "fonts/BYekan.ttf";
        Typeface font = Typeface.createFromAsset(getAssets(), fontPath);
        button = (Button) findViewById(R.id.chapter1button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.chapter2button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.chapter3button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.chapter4button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.chapter5button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.chapter6button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.total_button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.AboutButton);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.ContactButton);
        button.setTypeface(font);
    }

    public void Chapter1Click(View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "1");
        startActivity(i);
    }

    public void Chapter2Click(View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "2");
        startActivity(i);
    }

    public void Chapter3Click(View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "3");
        startActivity(i);
    }

    public void Chapter4Click(View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "4");
        startActivity(i);
    }

    public void Chapter5Click(View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "5");
        startActivity(i);
    }

    public void Chapter6Click(View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "6");
        startActivity(i);
    }

    public void totalClick(View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl","t");
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


