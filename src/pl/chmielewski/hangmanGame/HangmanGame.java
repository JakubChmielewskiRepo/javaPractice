package pl.chmielewski.hangmanGame;

import java.util.Arrays;
import java.util.HashSet;

public class HangmanGame {

    public static void main(String[] args) {


        HangmanGame hangmanGame=new HangmanGame();
        Hangman hangman=new Hangman();
        String[] alphabetArray={"a","b","c","d","e","f","g","h","i","j","k","l","ł","m","n","o","ó","p","r","s","ś","t","u","w","y","z","ź","ż"};
        HashSet<String> alphabet=new HashSet<>(Arrays.asList(alphabetArray));
        hangmanGame.startGame();
        //hangmanMessagePrinter.printGameMenu();
    }

     void startGame() {
         HangmanMessagePrinter hangmanMessagePrinter=new HangmanMessagePrinter();
         hangmanMessagePrinter.printStartingMessage();
         hangmanMessagePrinter.printGameInstructions();
    }
}
