package pl.chmielewski.hangmanGame;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class HangmanGame {
    private HangmanGameHelper hangmanGameHelper =new HangmanGameHelper();
    private HangmanMessagePrinter hangmanMessagePrinter=new HangmanMessagePrinter();
    private Hangman hangman=new Hangman();
    private boolean hasTheGameEnded=false;

    public static void main(String[] args) {



        HangmanGame hangmanGame=new HangmanGame();
        Hangman hangman=new Hangman();

        hangmanGame.startGame();
        //hangmanMessagePrinter.printGameMenu();
    }

     void startGame() {
        String choseOption;

         String randomizedWord= hangmanGameHelper.randomizeWord();
        hangman.setWord(randomizedWord.toCharArray());
        hangman.setHashedWord();


         while (!hasTheGameEnded){
             hangmanMessagePrinter.printStartingMessage();
             hangmanMessagePrinter.printGameInstructions();
             hangmanMessagePrinter.printGallows(hangman.getGallowsState());
             hangmanMessagePrinter.printUsedLetters(hangman.getUsedLetters());
             hangmanMessagePrinter.printNumberOfLetters(randomizedWord);
             hangmanMessagePrinter.printEncryptedWord(hangman.getHashedWord());
             hangmanMessagePrinter.printPlayerOptions();

             choseOption = hangmanGameHelper.readPlayerInput();

             if (choseOption.equals("1")){
                String letter=hangmanGameHelper.readPlayerInput();
                if (hangmanGameHelper.checkIfLetterIsCorrect(letter,hangman)){

                }
             }
             else if (choseOption.equals("2")){

             }
             else if (choseOption.equals("3")){
                 hangmanMessagePrinter.printUsedLetters(hangman.getUsedLetters());
             }
             else if (choseOption.equals("4")){

             }
             else{
                 hangmanMessagePrinter.printIncorrectInputMessage();
             }

            HangmanGameHelper.clearConsole();
         }

    }
}
