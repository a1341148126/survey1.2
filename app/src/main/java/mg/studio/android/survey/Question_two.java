package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_two extends AppCompatActivity {
    private Button btn_q2;
    private RadioButton q21;
    private RadioButton q22;
    private RadioButton q23;
    private RadioButton q24;
    private RadioButton q25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
        q21=findViewById(R.id.q21);
        q22=findViewById(R.id.q22);
        q23=findViewById(R.id.q23);
        q24=findViewById(R.id.q24);
        q25=findViewById(R.id.q25);
        btn_q2=(Button)findViewById(R.id.btn_q2);
        btn_q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string2="The money your phone cost is:";
                if(q21.isChecked()){
                    string2=string2+q21.getText().toString();
                }
                if(q22.isChecked()){
                    string2=string2+q22.getText().toString();
                }
                if(q23.isChecked()){
                    string2=string2+q23.getText().toString();
                }
                if(q24.isChecked()){
                    string2=string2+q24.getText().toString();
                }
                if(q25.isChecked()){
                    string2=string2+q25.getText().toString();
                }

                Intent intent=getIntent();
                intent.setClass(Question_two.this,Question_three.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q2",string2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    //public void question2(View view2){


    //}
}
