package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_eight extends AppCompatActivity {
private Button btn_q8;
    private RadioButton q81;
    private RadioButton q82;
    private RadioButton q83;
    private RadioButton q84;
    private RadioButton q85;
    private RadioButton q86;
    private RadioButton q87;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);
        q81=findViewById(R.id.q81);
        q82=findViewById(R.id.q82);
        q83=findViewById(R.id.q83);
        q84=findViewById(R.id.q84);
        q85=findViewById(R.id.q85);
        q86=findViewById(R.id.q86);
        q87=findViewById(R.id.q87);
        btn_q8=(Button)findViewById(R.id.btn_q8);
        btn_q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string8="The brand of phone you will choose if you are going to buy a new one is:";
                if(q81.isChecked()){
                    string8=string8+q81.getText().toString();
                }
                if(q82.isChecked()){
                    string8=string8+q82.getText().toString();
                }
                if(q83.isChecked()){
                    string8=string8+q83.getText().toString();
                }
                if(q84.isChecked()){
                    string8=string8+q84.getText().toString();
                }
                if(q85.isChecked()){
                    string8=string8+q85.getText().toString();
                }
                if(q86.isChecked()){
                    string8=string8+q86.getText().toString();
                }
                if(q87.isChecked()){
                    string8=string8+q87.getText().toString();
                }
                Intent intent=getIntent();
                intent.setClass(Question_eight.this,Question_nine.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q8",string8);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    //public void question8(View view8){


    //}
}
