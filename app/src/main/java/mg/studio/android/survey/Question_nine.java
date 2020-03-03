package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_nine extends AppCompatActivity {
private Button btn_q9;
    private RadioButton q91;
    private RadioButton q92;
    private RadioButton q93;
    private RadioButton q94;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);
        q91=findViewById(R.id.q91);
        q92=findViewById(R.id.q92);
        q93=findViewById(R.id.q93);
        q94=findViewById(R.id.q94);
        btn_q9=(Button)findViewById(R.id.btn_q9);
        btn_q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string9="The characteristic you think is most important to evaluate a phone is:";
                if(q91.isChecked()){
                    string9=string9+q91.getText().toString();
                }
                if(q92.isChecked()){
                    string9=string9+q92.getText().toString();
                }
                if(q93.isChecked()){
                    string9=string9+q93.getText().toString();
                }
                if(q94.isChecked()){
                    string9=string9+q94.getText().toString();
                }
                Intent intent=getIntent();
                intent.setClass(Question_nine.this,Question_ten.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q9",string9);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    //public void question9(View view9){


    //}
}
