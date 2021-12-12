package pl.chmielewski.hangmanGame;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HangmanMessagePrinter {


    public void printGallows(int gallowsStep) {
        switch (gallowsStep){
            case 1:
                System.out.print
                (
                        "            \n"+
                        "            \n"+
                        "            \n"+
                        "            \n"+
                        "            \n"+
                        "            \n"+
                        "/           \n"

                );
                break;

            case 2:
                System.out.println
                        (
                                "            \n"+
                                "            \n"+
                                "            \n"+
                                "            \n"+
                                "            \n"+
                                "            \n"+
                                "/\\         \n"

                        );
                break;
            case 3:
                System.out.println
                        (
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 4:
                System.out.println
                        (
                                "|---------  \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 5:
                System.out.println
                        (
                                "|---------  \n"+
                                "|        |  \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 6:
                System.out.println
                        (
                                "|---------  \n"+
                                "|        |  \n"+
                                "|        O  \n"+
                                "|           \n"+
                                "|           \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 7:
                System.out.println
                        (
                                "|---------  \n"+
                                "|        |  \n"+
                                "|        O  \n"+
                                "|        |  \n"+
                                "|           \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 8:
                System.out.println
                        (
                                "|---------  \n"+
                                "|        |  \n"+
                                "|        O  \n"+
                                "|        |\\ \n"+
                                "|           \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;

            case 9:
                System.out.println
                        (
                                "|---------  \n"+
                                "|        |  \n"+
                                "|        O  \n"+
                                "|       /|\\ \n"+
                                "|           \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 10:
                System.out.println
                        (
                                "|---------  \n"+
                                "|        |  \n"+
                                "|        O  \n"+
                                "|       /|\\ \n"+
                                "|         \\ \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 11:
                System.out.println
                        (
                                "|---------  \n"+
                                "|        |  \n"+
                                "|        O  \n"+
                                "|       /|\\ \n"+
                                "|       / \\ \n"+
                                "|           \n"+
                                "/\\         \n"

                        );
                break;
            case 12:
                System.out.println
                        (
                                "|---------  \n"+
                                        "|        |  \n"+
                                        "|        O  \n"+
                                        "|       \\|/ \n"+
                                        "|       / \\ \n"+
                                        "|           \n"+
                                        "/\\         \n"

                        );
                break;
        }
        System.out.println();
    }

    public void printStartingMessage() {
        System.out.println("Zagrajmy w wisielca!\n");
    }

    public void printGameInstructions() {
        System.out.println("Twoim zadaniem jest odgadnięcie hasła, liczba znaków \"_\" odpowiada ilości liter w haśle.");
        System.out.println("Kiedy podasz literę alfabetu a ona zawiera się w wyrazie, odpowiedni znak \"_\" zamieni się w literę.");
        System.out.println("Jeżeli jednak podana przez ciebie litera alfabetu nie zawiera się w haśle," +
                " wtedy dorysowany zostanie kolejny element szubienicy.");
        System.out.println("Kiedy szubienica zostanie ukończona, bądź podane przez ciebie hasło będzie nieprawidłowe, przegrywasz grę. :(");
        System.out.println("Powodzenia!\n");
    }

    public void printGameMenu() {
        System.out.println("Wpisz cyfrę, aby wykonać przypisaną do niej akcje.\n");
        System.out.println("1- Podaj literę alfabetu.");
        System.out.println("2- Odgadnij hasło.");
        System.out.println("3- Wyświetl stan szubienicy.");
        System.out.println("4- Wyświetl instrukcję gry.");
    }

    public void printNumberOfLetters(String randomizedWord) {
        System.out.println("Hasło zawiera " + randomizedWord.length() + " liter.");
    }

    public void printEncryptedWord(char[] hashedWord) {

        for (char letter:hashedWord) {
            System.out.print(letter+" ");
        }
        System.out.println("\n");
    }

    public void printPlayerOptions() {
        System.out.println();
        System.out.println("1- Podaj literę.");
        System.out.println("2- Odgadnij hasło");
        System.out.println("3- Zakończ gre.");
    }

    public void printIncorrectInputMessage() {
        System.out.println("Wprowadzone dane są nieprawidłowe, spróbuj ponownie");
    }

    public void printUsedLetters(HashSet<String> usedLetters) {
        System.out.println();
        System.out.println("Użyte litery:");
        for (String letter:usedLetters) {
            System.out.print(letter + " ");

        }
        System.out.println();
    }

    public void printInsertLetterMessage() {
        System.out.println("Podaj literę: ");
    }

    public void printLostGameMessage(char[] word) {
        System.out.println("Przegrałeś! Może następnym razem pójdzie ci lepiej.");
        System.out.println("Poprawne hasło to: "+ new String(word));
    }

    public void printGallowsMessage() {
        System.out.println("Szubienica:\n");
    }

    public void printInsertPasswordMessage() {
        System.out.println("Podaj hasło:");
    }
}
