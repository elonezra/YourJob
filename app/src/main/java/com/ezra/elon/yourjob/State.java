package com.ezra.elon.yourjob;

/**
 * Created by elon on 06/09/2017.
 */

public class State
{
    State nextStateTrue;
    State nextStateFalse;
    int output;
    String question;

    public State()
    {

    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public int getOutput() {
        return output;
    }

    public State getNextStateFalse() {
        return nextStateFalse;
    }

    public State getNextStateTrue() {
        return nextStateTrue;
    }

    public void setNextStateFalse(State nextStateFalse) {
        this.nextStateFalse = nextStateFalse;
    }

    public void setNextStateTrue(State nextStateTrue) {
        this.nextStateTrue = nextStateTrue;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}