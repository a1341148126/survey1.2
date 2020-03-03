package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.widget.CheckBox;
import android.widget.Toast;
=======
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
>>>>>>> d5d32b812e6d00a39ce14a0fead8cb7ce37976e8

public class MainActivity extends AppCompatActivity {


    private Button button_start;
    private RadioButton radioButton_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        button_start=findViewById(R.id.radioButton_start);
        button_start=(Button)findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,Question_one.class);
                startActivity(intent);
            }
        });
    }

    public void welClick(View v) {
        CheckBox cb = findViewById(R.id.cb_accept);
        Bundle bundle = new Bundle();
        Intent intent = new Intent(MainActivity.this,Activity_Question1.class);
        intent.putExtras(bundle);
        if (cb.isChecked()) {
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "请同意上述条款", Toast.LENGTH_SHORT).show();
        }
    }

}
