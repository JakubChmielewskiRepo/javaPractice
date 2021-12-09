package pl.chmielewski.hangmanGame;

import java.util.Arrays;
import java.util.HashSet;

public class HangmanGame {
    private HangmanGameHelper hangmanGameHelper =new HangmanGameHelper();
    private HangmanMessagePrinter hangmanMessagePrinter=new HangmanMessagePrinter();
    private boolean hasTheGameEnded=false;
    public static void main(String[] args) {


        HangmanGame hangmanGame=new HangmanGame();
        Hangman hangman=new Hangman();

        String[] alphabetArray={"a","b","c","d","e","f","g","h","i","j","k","l","ł","m","n","o","ó","p","r","s","ś","t","u","w","y","z","ź","ż"};
        HashSet<String> alphabet=new HashSet<>(Arrays.asList(alphabetArray));
        HashSet<String> usedLetters=new HashSet<>(alphabetArray.length);
        hangmanGame.startGame();
        //hangmanMessagePrinter.printGameMenu();
    }

     void startGame() {
        String choseOption;
         hangmanMessagePrinter.printStartingMessage();
         hangmanMessagePrinter.printGameInstructions();
         String randomizedWord= hangmanGameHelper.randomizeWord();
         hangmanMessagePrinter.printNumberOfLetters(randomizedWord);
         while (!hasTheGameEnded){
             hangmanMessagePrinter.printEncryptedWord(randomizedWord);
             hangmanMessagePrinter.printPlayerOptions();
             choseOption = hangmanGameHelper.readPlayerInput();


         }

    }
}
