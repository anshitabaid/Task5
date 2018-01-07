package anshita.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {
    public int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Intent intent = getIntent();
        score=Integer.parseInt (intent.getStringExtra(QuestionThree.SCORE));
        TextView tv = (TextView) findViewById(R.id.scr);
        tv.setText(Integer.toString(score));
    }
    @Override
    public void onBackPressed() { }

    public void quizAgain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}