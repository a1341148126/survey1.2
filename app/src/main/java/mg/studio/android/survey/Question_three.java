package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_three extends AppCompatActivity {
private Button btn_q3;
    private RadioButton q31;
    private RadioButton q32;
    private RadioButton q33;
    private RadioButton q34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);
        q31=findViewById(R.id.q31);
        q32=findViewById(R.id.q32);
        q33=findViewById(R.id.q33);
        q34=findViewById(R.id.q34);
        btn_q3=(Button)findViewById(R.id.btn_q3);
        btn_q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string3="The kind of phone that you use is:";
                if(q31.isChecked()){
                    string3=string3+q31.getText().toString();
                }
                if(q32.isChecked()){
                    string3=string3+q32.getText().toString();
                }
                if(q33.isChecked()){
                    string3=string3+q33.getText().toString();
                }
                if(q34.isChecked()){
                    string3=string3+q34.getText().toString();
                }
                Intent intent=getIntent();
                intent.setClass(Question_three.this,Question_four.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q3",string3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    //public void question3(View view3){



   // }
}
