package anshita.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static anshita.com.task5.MainActivity.SCORE;

public class QuestionTwo extends AppCompatActivity {

    public int score;
    static final String SCORE ="" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
        Intent intent=getIntent();
        score=Integer.parseInt (intent.getStringExtra(QuestionOne.SCORE));
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
        Intent intent=new Intent (this, QuestionThree.class);
        intent.putExtra(SCORE, Integer.toString(score));
        startActivity(intent);


    }
}