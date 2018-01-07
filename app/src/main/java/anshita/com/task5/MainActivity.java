package anshita.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final String SCORE ="" ;
    public int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void onBackPressed() { }
    public void nextQuestion(View view)
    {

        Intent intent=new Intent(this, QuestionOne.class);
        intent.putExtra(SCORE, Integer.toString(score));
        startActivity(intent);



    }

}
