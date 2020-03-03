package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question_six extends AppCompatActivity {
private Button btn_q6;
private EditText q61;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
        q61=findViewById(R.id.q61);
        btn_q6=(Button)findViewById(R.id.btn_q6);
        btn_q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string6="You expect your phone to have the function:";
                string6=string6+q61.getText().toString();
                Intent intent=getIntent();
                intent.setClass(Question_six.this,Question_seven.class);
                Bundle bundle=intent.getExtras();
                bundle.putString("Q6",string6);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    /*public void question6(View view6){

        string6=string6+q61.getText().toString();
    }*/
}
