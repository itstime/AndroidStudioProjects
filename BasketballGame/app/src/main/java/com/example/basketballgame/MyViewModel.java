package com.example.basketballgame;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> scoreA, scoreB;
    private int tempA, tempB;

    public MutableLiveData<Integer> getScoreA() {
        if (scoreA == null) {
            scoreA = new MutableLiveData<>();
            scoreA.setValue(0);
        }
        return scoreA;
    }

    public MutableLiveData<Integer> getScoreB() {
        if (scoreB == null) {
            scoreB = new MutableLiveData<>();
            scoreB.setValue(0);
        }
        return scoreB;
    }

    public void addA(int n) {
        tempA = scoreA.getValue();
        tempB = scoreB.getValue();
        scoreA.setValue(tempA + n);
    }

    public void addB(int n) {
        tempA = scoreA.getValue();
        tempB = scoreB.getValue();
        scoreB.setValue(tempB + n);
    }

    public void redo() {
        scoreA.setValue(tempA);
        scoreB.setValue(tempB);
    }

    public void clear() {
        tempA = scoreA.getValue();
        tempB = scoreB.getValue();
        scoreA.setValue(0);
        scoreB.setValue(0);
    }
}
