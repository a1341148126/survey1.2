package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question_five extends AppCompatActivity {
    private Button btn_q5;
    private CheckBox q51;
    private CheckBox q52;
    private CheckBox q53;
    private CheckBox q54;
    private CheckBox q55;
    private CheckBox q56;
    private CheckBox q57;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);
        q51=findViewById(R.id.q51);
        q52=findViewById(R.id.q52);
        q53=findViewById(R.id.q53);
        q54=findViewById(R.id.q54);
        q55=findViewById(R.id.q55);
        q56=findViewById(R.id.q56);
        q57=findViewById(R.id.q57);
        btn_q5=(Button)findViewById(R.id.btn_q5);
        btn_q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string5="The function(s) you most often used is(are):";
                if(q51.isChecked()){
                    string5=string5+q51.getText().toString()+" ";
                }
                if(q52.isChecked()){
                    string5=string5+q52.getText().toString()+" ";
                }
                if(q53.isChecked()){
                    string5=string5+q53.getText().toString()+" ";
                }
                if(q54.isChecked()){
                    string5=string5+q54.getText().toString()+" ";
                }
                if(q55.isChecked()){
                    string5=string5+q55.getText().toString()+" ";
                }
                if(q56.isChecked()){
                    string5=string5+q56.getText().toString()+" ";
                }
                if(q57.isChecked()){
                    string5=string5+q57.getText().toString()+" ";
                }
                Intent intent=getIntent();
                intent.setClass(Question_five.this,Question_six.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q5",string5);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
/*package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Question_five extends AppCompatActivity {
    private Button btn_q5;
    private CheckBox q51;
    private CheckBox q52;
    private CheckBox q53;
    private CheckBox q54;
    private CheckBox q55;
    private CheckBox q56;
    private CheckBox q57;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);
        q51=findViewById(R.id.q51);
        q52=findViewById(R.id.q52);
        q53=findViewById(R.id.q53);
        q54=findViewById(R.id.q54);
        q55=findViewById(R.id.q55);
        q56=findViewById(R.id.q56);
        q57=findViewById(R.id.q57);
        btn_q5=(Button)findViewById(R.id.btn_q5);
        btn_q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string5="The function(s) you most often used is(are):";
                if(q51.isChecked()){
                    string5=string5+q51.getText().toString()+" ";
                }
                if(q52.isChecked()){
                    string5=string5+q52.getText().toString()+" ";
                }
                if(q53.isChecked()){
                    string5=string5+q53.getText().toString()+" ";
                }
                if(q54.isChecked()){
                    string5=string5+q54.getText().toString()+" ";
                }
                if(q55.isChecked()){
                    string5=string5+q55.getText().toString()+" ";
                }
                if(q56.isChecked()){
                    string5=string5+q56.getText().toString()+" ";
                }
                if(q57.isChecked()){
                    string5=string5+q57.getText().toString()+" ";
                }
                Intent intent=getIntent();
                intent.setClass(Question_five.this,Question_six.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q5",string5);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}*/
