package com.ezra.elon.yourjob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityForGame extends AppCompatActivity {

    Fsm fsm;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTrue = (Button) findViewById(R.id.true_btn);
        Button btnFalse = (Button) findViewById(R.id.false_btn);
        textView = (TextView) findViewById(R.id.question_text_view);
        fsm = new Fsm(getBaseContext());
        fsm.setCurrentPosition(fsm.q.get(0));
        textView.setText(fsm.getCurrentPosition().getQuestion());
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                execute(true);
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                execute(false);

            }
        });
    }

    public void execute(boolean btnInpute)
    {
        Intent intent = new Intent(this,FinishedState.class);

        boolean flag = false;

        if(btnInpute)
        {
            fsm.setCurrentPosition(fsm.currentPosition.getNextStateTrue());

        }
        else {
            fsm.setCurrentPosition(fsm.currentPosition.getNextStateFalse());
        }
        textView.setText(fsm.getCurrentPosition().getQuestion());


        switch (fsm.currentPosition.getOutput())
        {

            case 1:
              //  Log.i("out State", "1");

                intent.putExtra("title",1);
                startActivity(intent);

                break;
            case 2:
              //  Log.i("out State", "1");
                intent.putExtra("title",2);
                startActivity(intent);
                break;

            case 3:
               // Log.i("out State", "1");
                intent.putExtra("title",3);
                startActivity(intent);
                break;

            case 4:
               // Log.i("out State", "1");
                intent.putExtra("title",4);

                startActivity(intent);
                break;


        }


    }

}
