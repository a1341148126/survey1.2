package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_one extends AppCompatActivity {
private Button btn_q1;
private RadioButton q11;
    private RadioButton q12;
    private RadioButton q13;
    private RadioButton q14;
    private RadioButton q15;
    private RadioButton q16;
    private RadioButton q17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);
        q11=findViewById(R.id.q11);
        q12=findViewById(R.id.q12);
        q13=findViewById(R.id.q13);
        q14=findViewById(R.id.q14);
        q15=findViewById(R.id.q15);
        q16=findViewById(R.id.q16);
        q17=findViewById(R.id.q17);
        btn_q1=(Button)findViewById(R.id.btn_q1);
        btn_q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1="The brand of phone  you will choose if you are going to buy a new one is:";
                if(q11.isChecked()){
                    string1=string1+q11.getText().toString();
                }
                if(q12.isChecked()){
                    string1=string1+q12.getText().toString();
                }
                if(q13.isChecked()){
                    string1=string1+q13.getText().toString();
                }
                if(q14.isChecked()){
                    string1=string1+q14.getText().toString();
                }
                if(q15.isChecked()){
                    string1=string1+q15.getText().toString();
                }
                if(q16.isChecked()){
                    string1=string1+q16.getText().toString();
                }
                if(q17.isChecked()){
                    string1=string1+q17.getText().toString();
                }
                Intent intent=new Intent();
                intent.setClass(Question_one.this,Question_two.class);
                Bundle bundle=new Bundle();
                bundle.putString("Q1",string1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
    //public void question1(View view1){


    //}
}
