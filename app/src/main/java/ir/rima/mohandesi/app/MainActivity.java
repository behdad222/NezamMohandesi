package ir.rima.mohandesi.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        String fontPath = "fonts/BYekan.ttf";
        Button button = (Button) findViewById(R.id.ListButton);
        Typeface font = Typeface.createFromAsset(getAssets(), fontPath);
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

    public void AboutClick(View view) {
        LayoutInflater factory = LayoutInflater.from(this);
        final View AboutDialogView = factory.inflate(R.layout.about_dialog, null);
        final AlertDialog AboutDialog = new AlertDialog.Builder(this).create();
        AboutDialog.setView(AboutDialogView);
        TextView textDialog;
        if (AboutDialogView != null) {
            textDialog = (TextView) AboutDialogView.findViewById(R.id.txt_dialog);
            textDialog.setText("dddddddddddd");
        }
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
            textDialog.setText("آدرس دفتر مرکزی: ‌تهران، بزرگراه اشرفی اصفهانی، خیابان باهنر، پلاک ۱۷۰\n" +
                    "خط ویژه: 15 65 95 44 - 021\n" +
                    "فکس : 16 65 95 44 - 021\n" +
                    "روابط عمومی: info@rima.ir \n" +
                    "واحد گرافیک:graphic@rima.ir \n" +
                    "واحد برنامه نویسی و توسعه وب: web@rima.ir \n" +
                    "واحد فیلم و انیمیشن: film@rima.ir \n" +
                    "واحد برنامه نویسی موبایل: mobile@rima.ir \n" +
                    "واحد پشتیبانی: support@rima.ir \n" +
                    "واحد فروش: sales@rima.ir \n" +
                    "واحد مدیریت ارتباط با مشتریان: crm@rima.ir \n" +
                    "واحد سامانه پیام کوتاه: sms@rima.ir ");
        }
        AboutDialog.show();
    }
}
