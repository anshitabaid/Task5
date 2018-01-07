package anshita.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionOne extends AppCompatActivity {
    public static final String SCORE ="" ;
    public int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        Intent intent=getIntent();
        score=Integer.parseInt (intent.getStringExtra(MainActivity.SCORE));
    }

    @Override
    public void onBackPressed() { }
    public void rightAnswer (View view)
    {
        score++;
        nextQuestion(view);
    }
    public void nextQuestion(View view)
    {
        Intent intent=new Intent (this, QuestionTwo.class);
        intent.putExtra(SCORE, Integer.toString(score));
        startActivity(intent);


    }
}
