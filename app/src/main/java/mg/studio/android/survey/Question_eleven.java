package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Question_eleven extends AppCompatActivity {
private Button btn_q11;
    private RadioButton q111;
    private RadioButton q112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);
        q111=findViewById(R.id.q111);
        q112=findViewById(R.id.q112);
        btn_q11=(Button)findViewById(R.id.btn_q11);
        btn_q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string11="Your gender is:";
                if(q111.isChecked()){
                    string11=string11+q111.getText().toString();
                }
                if(q112.isChecked()){
                    string11=string11+q112.getText().toString();
                }
                Intent intent=getIntent();
                intent.setClass(Question_eleven.this,Question_twelve.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q11",string11);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
   // public void question11(View view11){



    //}
}
