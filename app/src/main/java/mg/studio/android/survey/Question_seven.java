package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_seven extends AppCompatActivity {
private Button btn_q7;
    private RadioButton q71;
    private RadioButton q72;
    private RadioButton q73;
    private RadioButton q74;
    private RadioButton q75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);
        q71=findViewById(R.id.q71);
        q72=findViewById(R.id.q72);
        q73=findViewById(R.id.q73);
        q74=findViewById(R.id.q74);
        q75=findViewById(R.id.q75);
        btn_q7=(Button)findViewById(R.id.btn_q7);
        btn_q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string7="You will buy a new phone ";
                if(q71.isChecked()){
                    string7=string7+q71.getText().toString();
                }
                if(q72.isChecked()){
                    string7=string7+q72.getText().toString();
                }
                if(q73.isChecked()){
                    string7=string7+q73.getText().toString();
                }
                if(q74.isChecked()){
                    string7=string7+q74.getText().toString();
                }
                if(q75.isChecked()){
                    string7=string7+q75.getText().toString();
                }
                Intent intent=getIntent();
                intent.setClass(Question_seven.this,Question_eight.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q7",string7);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
   // public void question7(View view7){


    //}
}
