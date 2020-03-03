package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class Report extends AppCompatActivity {
private TextView report_finish;
    private TextView report2;
    private TextView report3;
    private TextView report4;
    private TextView report5;
    private TextView report6;
    private TextView report7;
    private TextView report8;
    private TextView report9;
    private TextView report10;
    private TextView report11;
    private TextView report12;
    private Button  btn_save;
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            "android.permission.READ_EXTERNAL_STORAGE",
            "android.permission.WRITE_EXTERNAL_STORAGE" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        final String A1 = bundle.getString("Q1");
        String A2 = bundle.getString("Q2");
        String A3 = bundle.getString("Q3");
        String A4 = bundle.getString("Q4");
        String A5 = bundle.getString("Q5");
        String A6 = bundle.getString("Q6");
        String A7 = bundle.getString("Q7");
        String A8 = bundle.getString("Q8");
        String A9 = bundle.getString("Q9");
        String A10 = bundle.getString("Q10");
        String A11 = bundle.getString("Q11");
        String A12 = bundle.getString("Q12");
        report_finish = findViewById(R.id.report_final);
        report_finish.setText(A1);
        report2 = findViewById(R.id.report2);
        report2.setText(A2);
        report3 = findViewById(R.id.report3);
        report3.setText(A3);
        report4 = findViewById(R.id.report4);
        report4.setText(A4);
        report5 = findViewById(R.id.report5);
        report5.setText(A5);
        report6 = findViewById(R.id.report6);
        report6.setText(A6);
        report7 = findViewById(R.id.report7);
        report7.setText(A7);
        report8 = findViewById(R.id.report8);
        report8.setText(A8);
        report9 = findViewById(R.id.report9);
        report9.setText(A9);
        report10 = findViewById(R.id.report10);
        report10.setText(A10);
        report11 = findViewById(R.id.report11);
        report11.setText(A11);
        report12 = findViewById(R.id.report12);
        report12.setText(A12);
        String msg = new String();
        msg = "{ \"Q1\":\"" + bundle.getString("Q1") + "\", ";
        msg += "\"Q2\":\"" + bundle.getString("Q2") + "\", ";
        msg += "\"Q3\":\"" + bundle.getString("Q3") + "\", ";
        msg += "\"Q4\":\"" + bundle.getString("Q4") + "\", ";
        msg += "\"Q5\":\"" + bundle.getString("Q5") + "\", ";
        msg += "\"Q6\":\"" + bundle.getString("Q6") + "\", ";
        msg += "\"Q7\":\"" + bundle.getString("Q7") + "\", ";
        msg += "\"Q8\":\"" + bundle.getString("Q8") + "\", ";
        msg += "\"Q9\":\"" + bundle.getString("Q9") + "\", ";
        msg += "\"Q10\":\"" + bundle.getString("Q10") + "\", ";
        msg += "\"Q11\":\"" + bundle.getString("Q11") + "\", ";
        msg += "\"Q12\":\"" + bundle.getString("Q12") + "\"}";
        saveToFile(msg);

   }


    public void saveToFile(String msg) {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_UNMOUNTED)) {
            Toast.makeText(this, "No external storage", Toast.LENGTH_SHORT).show();
        } else {
            File sdFile = Environment.getExternalStorageDirectory();
            File saveData = new File(sdFile, "1.json");
            if(sdFile.exists()) {
                try {
                    sdFile.createNewFile();
                } catch (Exception e) {

                }
            }


            try {
                FileOutputStream fout = new FileOutputStream(saveData);
                fout.write(msg.getBytes());
                fout.flush();
                fout.close();

                Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



        }

}
