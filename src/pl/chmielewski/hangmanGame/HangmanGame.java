package pl.chmielewski.hangmanGame;

import java.util.Arrays;

public class HangmanGame {
    private HangmanGameHelper hangmanGameHelper =new HangmanGameHelper();
    private HangmanMessagePrinter hangmanMessagePrinter=new HangmanMessagePrinter();
    private Hangman hangman=new Hangman();
    private boolean hasTheGameEnded=false;
    private boolean gallowsIncreased;

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
             hangmanMessagePrinter.printGallowsMessage();
             hangmanMessagePrinter.printGallows(hangman.getGallowsState());
             hangmanMessagePrinter.printUsedLetters(hangman.getUsedLetters());
             hangmanMessagePrinter.printNumberOfLetters(randomizedWord);
             hangmanMessagePrinter.printEncryptedWord(hangman.getHashedWord());
             hangmanMessagePrinter.printPlayerOptions();

             choseOption = hangmanGameHelper.readPlayerInput();

             switch (choseOption) {
                 case "1":
                     hangmanMessagePrinter.printInsertLetterMessage();
                     String letter = hangmanGameHelper.readPlayerInput();
                     letter=letter.toLowerCase();
                     if (hangmanGameHelper.checkIfLetterIsCorrect(letter, hangman)) {
                         if (!hangman.getUsedLetters().contains(letter)) {
                             hangman.setUsedLetters(hangman, letter);
                         } else {
                             hangman.incrementGallowsState();
                             gallowsIncreased=true;
                         }
                         if (hangman.checkIfWordIncludesLetter(letter)) {
                             hangman.setHashedWordLetter(letter);
                         }
                         else if(!hangman.checkIfWordIncludesLetter(letter) && !gallowsIncreased){
                             hangman.incrementGallowsState();
                         }
                         gallowsIncreased=false;
                     } else {
                         hangman.incrementGallowsState();
                     }

                     break;
                 case "2":
                     hangmanMessagePrinter.printInsertPasswordMessage();
                     String answer=hangmanGameHelper.readPlayerInput();
                     if(Arrays.equals(answer.toLowerCase().toCharArray(),hangman.getWord())){
                         hangman.setGallowsState(12);

                     }
                     else {hangman.setGallowsState(11);}
                     break;
                 case "3":
                     hangman.setGallowsState(11);
                     break;

                 default:
                     hangmanMessagePrinter.printIncorrectInputMessage();
                     break;
             }
            if (hangman.getGallowsState()==11){
                hangmanMessagePrinter.printLostGameMessage(hangman.getWord());
                hangmanMessagePrinter.printGallows(11);
                break;
            }
            else if (hangman.getGallowsState()==12){
                System.out.println("Udało ci się odgadnąć hasło, dobra robota!");
                hangmanMessagePrinter.printGallows(12);
                break;
            }
            HangmanGameHelper.clearConsole();
         }

    }
}
