package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_ten extends AppCompatActivity {
private Button btn_q10;
    private RadioButton q101;
    private RadioButton q102;
    private RadioButton q103;
    private RadioButton q104;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);
        q101=findViewById(R.id.q101);
        q102=findViewById(R.id.q102);
        q103=findViewById(R.id.q103);
        q104=findViewById(R.id.q104);
        btn_q10=(Button)findViewById(R.id.btn_q10);
        btn_q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string10="You are ";
                if(q101.isChecked()){
                    string10=string10+q101.getText().toString();
                }
                if(q102.isChecked()){
                    string10=string10+q102.getText().toString();
                }
                if(q103.isChecked()){
                    string10=string10+q103.getText().toString();
                }
                if(q104.isChecked()){
                    string10=string10+q104.getText().toString();
                }
                Intent intent=getIntent();
                intent.setClass(Question_ten.this,Question_eleven.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q10",string10);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
   // public void question10(View view10){


    //}
}
