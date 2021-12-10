package pl.chmielewski.hangmanGame;

import java.util.Arrays;
import java.util.HashSet;

public class Hangman {
    private HashSet<String> solution;
    private int gallowsState=1;
    private String[] alphabetArray={"a","b","c","d","e","f","g","h","i","j","k","l","ł","m","n","o","ó","p","r","s","ś","t","u","w","y","z","ź","ż"};
    private HashSet<String> alphabet=new HashSet<>(Arrays.asList(alphabetArray));
    private char[] word;
    private char[] hashedWord;

    public HashSet<String> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(HashSet<String> usedLetters) {
        this.usedLetters = usedLetters;
    }

    private HashSet<String> usedLetters=new HashSet<>(alphabetArray.length);

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

    public char[] getWord() {
        return word;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    public char[] getHashedWord() {
        return hashedWord;
    }

    public void setHashedWord() {
        hashedWord=word;
        Arrays.fill(hashedWord, '_');
    }
}
