package pl.chmielewski.hangmanGame;

import java.util.Arrays;
import java.util.HashSet;

    class Hangman {
    private int gallowsState=1;

    private String[] alphabetArray={"a","ą","b","c","ć","d","e","ę","f","g","h","i","j","k","l","ł","m","n","o","ó","p","r","s","ś","t","u","w","y","z","ź","ż"};
    private HashSet<String> usedLetters=new HashSet<>(alphabetArray.length);
    private HashSet<String> alphabet=new HashSet<>(Arrays.asList(alphabetArray));
    private char[] word;
    private char[] hashedWord;

    HashSet<String> getUsedLetters() {
        return usedLetters;
    }

     void setUsedLetters(Hangman hangman,String letter) {
        hangman.usedLetters.add(letter);
    }

     int getGallowsState() {
        return gallowsState;
    }

     void incrementGallowsState() {
        gallowsState++;
    }

     char[] getWord() {
        return word;
    }

     void setWord(char[] word) {
        this.word = word;
    }

     char[] getHashedWord() {
        return hashedWord;
    }

     void setHashedWord() {
        hashedWord=new char[word.length];
        Arrays.fill(hashedWord, '_');
    }
     HashSet<String> getAlphabet() {
        return alphabet;
    }

     boolean checkIfWordIncludesLetter(String letter) {
        for (char wordLetter : word) {
            if (wordLetter == letter.charAt(0)) {
                return true;
            }
        }
        return false;
    }

     void setHashedWordLetter(String letter) {
        for (int i=0;i<word.length;i++){
            if (word[i] == letter.charAt(0)) {
                hashedWord[i] = letter.charAt(0);
            }
        }
    }

     void setGallowsState(int state) {
        gallowsState=state;
    }
}

