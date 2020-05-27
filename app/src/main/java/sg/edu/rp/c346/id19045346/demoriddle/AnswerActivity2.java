package sg.edu.rp.c346.id19045346.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        textView = findViewById(R.id.textView2);
        textView.setText("This is third page");

        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question2");
        textView.setText(questionSelected+" answer is Gone");
    }
}
