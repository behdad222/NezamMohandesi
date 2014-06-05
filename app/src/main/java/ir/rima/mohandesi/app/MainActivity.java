package ir.rima.mohandesi.app;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* final ActionBar actionBar = getActionBar();
        actionBar.setCustomView(R.layout.actionbar_custom);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);*/
    }

    public void ListClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ListActivity.class);
        startActivity(i);
    }

    public void SelectClick (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.SelectActivity.class);
        startActivity(i);
    }

    public void AboutClick(View view) {
        LayoutInflater factory = LayoutInflater.from(this);
        final View deleteDialogView = factory.inflate(R.layout.dialog, null);
        final AlertDialog deleteDialog = new AlertDialog.Builder(this).create();
        deleteDialog.setView(deleteDialogView);
        TextView textDialog;
        if (deleteDialogView != null) {
            textDialog = (TextView) deleteDialogView.findViewById(R.id.txt_dialog);


            textDialog.setText("dddddddddddd");

        }

        deleteDialog.show();
    }

}
