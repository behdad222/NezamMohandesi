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
        button = (Button) findViewById(R.id.chapter10button);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.AboutButton);
        button.setTypeface(font);
        button = (Button) findViewById(R.id.ContactButton);
        button.setTypeface(font);
    }

    public void fasl1 (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "1");
        startActivity(i);
    }

    public void fasl2 (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "2");
        startActivity(i);
    }

    public void fasl3 (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "3");
        startActivity(i);
    }

    public void fasl4 (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "4");
        startActivity(i);
    }

    public void fasl5 (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "5");
        startActivity(i);
    }

    public void fasl6 (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl", "6");
        startActivity(i);
    }

    public void total (View view) {
        Intent i = new Intent(this, ir.rima.mohandesi.app.ShowActivity.class);
        i.putExtra("fasl","t");
        startActivity(i);
    }



    public void AboutClick(View view) {
        LayoutInflater factory = LayoutInflater.from(this);
        final View AboutDialogView = factory.inflate(R.layout.about_dialog, null);
        final AlertDialog AboutDialog = new AlertDialog.Builder(this).create();
        AboutDialog.setView(AboutDialogView);
        TextView textDialog;
    /*    if (AboutDialogView != null) {
            textDialog = (TextView) AboutDialogView.findViewById(R.id.txt_dialog);
            textDialog.setText("dddddddddddd");
        }*/
        AboutDialog.show();
    }

    public void ContactClick(View view) {
        LayoutInflater factory = LayoutInflater.from(this);
        final View AboutDialogView = factory.inflate(R.layout.about_dialog, null);
        final AlertDialog AboutDialog = new AlertDialog.Builder(this).create();
        AboutDialog.setView(AboutDialogView);
        TextView textDialog;
        if (AboutDialogView != null) {
            textDialog = (TextView) AboutDialogView.findViewById(R.id.txt_dialog);
            textDialog.setText("این برنامه به سفارش دانشگاه آزاد اسلامی واحد مهدیشهر توسط شرکت فناوری اطلاعات وارتباطات ریما نوشته شده است \n" +
                    "\n" +
                    "در صورتی که نیاز به اطلاعات بیشتر یا طراحی سایت و برنامه نویسی موبایل اختصاصی دارید با شماره تماس 44956515 تماس حاصل فرمایید.");
        }
        AboutDialog.show();
    }
}


