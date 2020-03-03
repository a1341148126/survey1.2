package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_twelve extends AppCompatActivity {
private Button btn_q12;
    private RadioButton q121;
    private RadioButton q122;
    private RadioButton q123;
    private RadioButton q124;
    private RadioButton q125;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_twelve);
        q121=findViewById(R.id.q121);
        q122=findViewById(R.id.q122);
        q123=findViewById(R.id.q123);
        q124=findViewById(R.id.q124);
        q125=findViewById(R.id.q125);
        btn_q12=(Button)findViewById(R.id.btn_q12);
        btn_q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string12="The money you earn per month is:";
                if(q121.isChecked()){
                    string12=string12+"You haven't a job so you earn no money per month";
                }
                if(q122.isChecked()){
                    string12=string12+q122.getText().toString();
                }
                if(q123.isChecked()){
                    string12=string12+q123.getText().toString();
                }
                if(q124.isChecked()){
                    string12=string12+q124.getText().toString();
                }
                Intent intent=getIntent();
                intent.setClass(Question_twelve.this,Finish.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q12",string12);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    //public void question12(View view12){



    //}
}
