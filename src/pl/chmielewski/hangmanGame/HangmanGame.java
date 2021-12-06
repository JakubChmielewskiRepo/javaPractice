package pl.chmielewski.hangmanGame;

public class HangmanGame {

    public static void main(String[] args) {

        HangmanMessagePrinter hangmanMessagePrinter=new HangmanMessagePrinter();
        hangmanMessagePrinter.printStartingMessage();
        hangmanMessagePrinter.printGameInstructions();
    }
}
