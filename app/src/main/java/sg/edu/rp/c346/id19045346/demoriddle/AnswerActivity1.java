package sg.edu.rp.c346.id19045346.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        tvAnswer.setText("In Second Activity");


        Intent intentReceived = getIntent();
        int questionSelected = intentReceived.getIntExtra("Question", 0);

        if(questionSelected == 1) {
            tvAnswer.setText("Question " +questionSelected + " answer is: Queue");

        }
        else if(questionSelected == 2) {
            tvAnswer.setText("Question " +questionSelected + " answer is: Gone");

        }



    }
}
