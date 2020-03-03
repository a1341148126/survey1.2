package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question_four extends AppCompatActivity {
private Button btn_q4;
    private CheckBox q41;
    private CheckBox q42;
    private CheckBox q43;
    private CheckBox q44;
    private CheckBox q45;
    private CheckBox q46;
    private CheckBox q47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);
        q41=findViewById(R.id.q41);
        q42=findViewById(R.id.q42);
        q43=findViewById(R.id.q43);
        q44=findViewById(R.id.q44);
        q45=findViewById(R.id.q45);
        q46=findViewById(R.id.q46);
        q47=findViewById(R.id.q47);
        btn_q4=(Button)findViewById(R.id.btn_q4);
        btn_q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string4="The function(s) your phone have now is(are):";
                if(q41.isChecked()){
                    string4=string4+q41.getText().toString()+" ";
                }
                if(q42.isChecked()){
                    string4=string4+q42.getText().toString()+" ";
                }
                if(q43.isChecked()){
                    string4=string4+q43.getText().toString()+" ";
                }
                if(q44.isChecked()){
                    string4=string4+q44.getText().toString()+" ";
                }
                if(q45.isChecked()){
                    string4=string4+q45.getText().toString()+" ";
                }
                if(q46.isChecked()){
                    string4=string4+q46.getText().toString()+" ";
                }
                if(q47.isChecked()){
                    string4=string4+q47.getText().toString()+" ";
                }
                Intent intent=getIntent();
                intent.setClass(Question_four.this,Question_five.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q4",string4);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    //public void question4(View view4){

    //}
}
