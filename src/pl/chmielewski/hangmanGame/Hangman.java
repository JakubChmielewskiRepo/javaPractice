package pl.chmielewski.hangmanGame;

import java.util.Arrays;
import java.util.HashSet;

public class Hangman {
    private HashSet<String> solution;
    private int gallowsState=1;

    private String[] alphabetArray={"a","ą","b","c","ć","d","e","ę","f","g","h","i","j","k","l","ł","m","n","o","ó","p","r","s","ś","t","u","w","y","z","ź","ż"};
    private HashSet<String> usedLetters=new HashSet<>(alphabetArray.length);
    private HashSet<String> alphabet=new HashSet<>(Arrays.asList(alphabetArray));
    private char[] word;
    private char[] hashedWord;

    public HashSet<String> getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(Hangman hangman,String letter) {
        hangman.usedLetters.add(letter);
    }

    public int getGallowsState() {
        return gallowsState;
    }

    public void incrementGallowsState() {
        gallowsState++;
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
        hashedWord=new char[word.length];
        Arrays.fill(hashedWord, '_');
    }
    public HashSet<String> getAlphabet() {
        return alphabet;
    }

    public boolean checkIfWordIncludesLetter(String letter) {
        for (char wordLetter : word) {
            if (wordLetter == letter.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public void setHashedWordLetter(String letter) {
        for (int i=0;i<word.length;i++){
            if (word[i] == letter.charAt(0)) {
                hashedWord[i] = letter.charAt(0);
            }
        }
    }

    public void setGallowsState(int state) {
        gallowsState=state;
    }
}

