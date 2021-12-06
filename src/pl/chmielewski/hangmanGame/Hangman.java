package pl.chmielewski.hangmanGame;

import java.util.HashSet;

public class Hangman {
    private HashSet<String> solution;

    public HashSet<String> getCode() {
        return solution;
    }

    public void setCode(HashSet<String> solution) {
        this.solution = solution;
    }


}
