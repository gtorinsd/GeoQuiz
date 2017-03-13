package com.example.my.geoquiz;

/**
 * Created by 1 on 13.03.2017.
 */

public class TrueFalse {
    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        this.mQuestion = question;
    }

    private int mQuestion;

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        this.mTrueQuestion = trueQuestion;
    }

    private boolean mTrueQuestion;


    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
}
