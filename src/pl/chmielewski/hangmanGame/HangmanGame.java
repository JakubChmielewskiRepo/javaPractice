package pl.chmielewski.hangmanGame;

import java.util.Arrays;

 class HangmanGame {
    private HangmanGameHelper hangmanGameHelper =new HangmanGameHelper();
    private HangmanMessagePrinter hangmanMessagePrinter=new HangmanMessagePrinter();
    private Hangman hangman=new Hangman();
    private boolean hasTheGameEnded=false;
    private boolean gallowsIncreased;

    public static void main(String[] args) {

        HangmanGame hangmanGame=new HangmanGame();

        hangmanGame.startGame();
    }

     private void startGame() {
        String choseOption;

         String randomizedWord= hangmanGameHelper.randomizeWord();
        hangman.setWord(randomizedWord.toCharArray());
        hangman.setHashedWord();


         while (!hasTheGameEnded){
             printBasicInfo(randomizedWord);

             choseOption = hangmanGameHelper.readPlayerInput();

             switch (choseOption) {
                 case "1":
                     judgePlayerLetterInput();

                     break;
                 case "2":
                     judgePlayerPasswordInput();
                     break;
                 case "3":
                     hangman.setGallowsState(11);
                     break;

                 default:
                     hangmanMessagePrinter.printIncorrectInputMessage();
                     break;
             }
             if (judgeIfTheGameHasEnded()) break;
             HangmanGameHelper.clearConsole();
         }
         playAgain();
     }

     private void playAgain() {
         hangmanMessagePrinter.printRestartMessage();
         String restartDecision=hangmanGameHelper.readPlayerInput();
         if (restartDecision.equals("1")){
             HangmanGameHelper.clearConsole();
             main(new String[]{""});
         }
     }

     private boolean judgeIfTheGameHasEnded() {
        if (hangman.getGallowsState()==11){
            hangmanMessagePrinter.printLostGameMessage(hangman.getWord());
            hangmanMessagePrinter.printGallows(11);
            return true;
        }
        else if (hangman.getGallowsState()==12){
            System.out.println("Udało ci się odgadnąć hasło, dobra robota!");
            hangmanMessagePrinter.printGallows(12);
            return true;
        }
        return false;
    }

     private void judgePlayerPasswordInput() {
        hangmanMessagePrinter.printInsertPasswordMessage();
        String answer=hangmanGameHelper.readPlayerInput();
        if(Arrays.equals(answer.toLowerCase().toCharArray(),hangman.getWord())){
            hangman.setGallowsState(12);

        }
        else {hangman.setGallowsState(11);}
    }

     private void judgePlayerLetterInput() {
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
    }

    private void printBasicInfo(String randomizedWord) {
        hangmanMessagePrinter.printStartingMessage();
        hangmanMessagePrinter.printGameInstructions();
        hangmanMessagePrinter.printGallowsMessage();
        hangmanMessagePrinter.printGallows(hangman.getGallowsState());
        hangmanMessagePrinter.printUsedLetters(hangman.getUsedLetters());
        hangmanMessagePrinter.printNumberOfLetters(randomizedWord);
        hangmanMessagePrinter.printEncryptedWord(hangman.getHashedWord());
        hangmanMessagePrinter.printPlayerOptions();
    }
}
