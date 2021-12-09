package pl.chmielewski.hangmanGame;

import java.util.HashSet;

public class Hangman {
    private HashSet<String> solution;
    private int gallowsState=0;

    public int getGallowsState() {
        return gallowsState;
    }

    public void setGallowsState(int gallowsState) {
        this.gallowsState = gallowsState;
    }

    public HashSet<String> getCode() {
        return solution;
    }

    public void setCode(HashSet<String> solution) {
        this.solution = solution;
    }


}
