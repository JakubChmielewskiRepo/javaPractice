package pl.chmielewski.hangmanGame;

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
        }
    }

    public void printStartingMessage() {
        System.out.println("Zagrajmy w wisielca!\n");
    }

    public void printGameInstructions() {
        System.out.println("Twoim zadaniem jest odgadnięcie hasła, liczba znaków \"_\" odpowiada ilości liter w haśle.");
        System.out.println("Kiedy podasz literę alfabetu a ona zawiera się w wyrazie, odpowiedni znak \"_\" zamieni się w literę.");
        System.out.println("Następnie będziesz mógł spróbować odgadnąć hasło.");
        System.out.println("Jeżeli jednak podana przez ciebie litera alfabetu nie zawiera się w haśle, bądź podane przez ciebie hasło jest nieprawidłowe," +
                " wtedy dorysowane zostaną kolejne elementy szubienicy.");
        System.out.println("Kiedy szubienica zostanie ukończona, przegrywasz grę. :(");
        System.out.println("Powodzenia!\n");
    }

    public void printGameMenu() {
        System.out.println("Wpisz cyfrę, aby wykonać przypisaną do niej akcje.\n");
        System.out.println("1- Podaj literę alfabetu.");
        System.out.println("2- Podaj hasło.");
        System.out.println("3- Wyświetl stan szubienicy.");
        System.out.println("4- Wyświetl instrukcję gry.");
    }

    public void printNumberOfLetters(String randomizedWord) {
        System.out.println("Hasło zawiera " + randomizedWord.length() + " liter.");
    }

    public void printEncryptedWord(String randomizedWord) {

        for (int i=0; i<randomizedWord.length(); i++){
            System.out.print("_ ");
        }
        System.out.println("\n");
    }

    public void printPlayerOptions() {
        System.out.println("1- Podaj literę.");
        System.out.println("2- Sprawdź stan szubienicy.");
        System.out.println("3- Wyświetl zużyte litery.");
        System.out.println("4- Zakończ gre.");
    }

    public void printIncorrectInputMessage() {
        System.out.println("Wprowadzone dane są nieprawidłowe, spróbuj ponownie");
    }

    public void printUsedLetters(HashSet<String> usedLetters) {
        for (String letter:usedLetters) {
            System.out.print(letter);

        }
        System.out.println();
    }
}
