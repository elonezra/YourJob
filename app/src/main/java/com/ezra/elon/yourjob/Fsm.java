package com.ezra.elon.yourjob;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by elon on 06/09/2017.
 */

public class Fsm {

ArrayList<State> q = new ArrayList<>();

    State currentPosition;
    Context context;
    String [] str;

    public Fsm(Context context)
    {
     str = context.getResources().getStringArray(R.array.arrying);


       for (int i = 0;i<20;i++)
       {
        q.add(new State());
       }
        for (int i = 0;i<20;i++)
        {
            q.get(i).setOutput(0);
            q.get(i).setQuestion(str[i]);
        }

        //STATE 0
        q.get(0).setNextStateTrue(q.get(1));
        q.get(0).setNextStateFalse(q.get(2));

        //STATE 1
        q.get(1).setNextStateTrue(q.get(3));
        q.get(1).setNextStateFalse(q.get(4));

        //STATE 2
        q.get(2).setNextStateTrue(q.get(6));
        q.get(2).setNextStateFalse(q.get(5));

        //STATE 2
        q.get(3).setNextStateTrue(q.get(7));
        q.get(3).setNextStateFalse(q.get(8));

        //STATE 2
        q.get(4).setNextStateTrue(q.get(8));
        q.get(4).setNextStateFalse(q.get(7));

        //STAE 2
        q.get(5).setNextStateTrue(q.get(9));
        q.get(5).setNextStateFalse(q.get(10));

        //STATE 2
        q.get(6).setNextStateTrue(q.get(10));
        q.get(6).setNextStateFalse(q.get(9));

        //STATE 2
        q.get(7).setNextStateTrue(q.get(11));
        q.get(7).setNextStateFalse(q.get(12));

        //STATE 2
        q.get(8).setNextStateTrue(q.get(13));
        q.get(8).setNextStateFalse(q.get(12));

        //STATE 2
        q.get(9).setNextStateTrue(q.get(13));
        q.get(9).setNextStateFalse(q.get(12));

        //STATE 2
        q.get(10).setNextStateTrue(q.get(13));
        q.get(10).setNextStateFalse(q.get(14));

        //STATE 2
        q.get(11).setNextStateTrue(q.get(15));
        q.get(11).setNextStateFalse(q.get(16));


        //STATE 2
        q.get(12).setNextStateTrue(q.get(16));
        q.get(12).setNextStateFalse(q.get(18));

        //STATE 2
        q.get(13).setNextStateTrue(q.get(18));
        q.get(13).setNextStateFalse(q.get(19));

        //STATE 2
        q.get(14).setNextStateTrue(q.get(19));
        q.get(14).setNextStateFalse(q.get(18));


        ///output
        //STATE 0
        q.get(15).setOutput(1);

        q.get(16).setOutput(2);

        q.get(18).setOutput(3);

        q.get(19).setOutput(4);

    }


    public void setCurrentPosition(State currentPosition) {
        this.currentPosition = currentPosition;
    }


    public State getCurrentPosition() {
        return currentPosition;
    }
}
