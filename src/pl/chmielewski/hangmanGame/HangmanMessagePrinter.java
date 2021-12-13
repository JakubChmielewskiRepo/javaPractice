package pl.chmielewski.hangmanGame;

import java.util.HashSet;

class HangmanMessagePrinter {


     void printGallows(int gallowsStep) {
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

     void printStartingMessage() {
        System.out.println("Zagrajmy w wisielca!\n");
    }

     void printGameInstructions() {
        System.out.println("Twoim zadaniem jest odgadnięcie hasła, liczba znaków \"_\" odpowiada ilości liter w haśle.");
        System.out.println("Kiedy podasz literę alfabetu a ona zawiera się w wyrazie, odpowiedni znak \"_\" zamieni się w literę.");
        System.out.println("Jeżeli jednak podana przez ciebie litera alfabetu nie zawiera się w haśle," +
                " wtedy dorysowany zostanie kolejny element szubienicy.");
        System.out.println("Kiedy szubienica zostanie ukończona, bądź podane przez ciebie hasło będzie nieprawidłowe, przegrywasz grę. :(");
        System.out.println("Powodzenia!\n");
    }

     void printNumberOfLetters(String randomizedWord) {
        System.out.println("Hasło zawiera " + randomizedWord.length() + " liter.");
    }

     void printEncryptedWord(char[] hashedWord) {

        for (char letter:hashedWord) {
            System.out.print(letter+" ");
        }
        System.out.println("\n");
    }

     void printPlayerOptions() {
        System.out.println();
        System.out.println("1- Podaj literę.");
        System.out.println("2- Odgadnij hasło");
        System.out.println("3- Zakończ gre.");
    }

     void printIncorrectInputMessage() {
        System.out.println("Wprowadzone dane są nieprawidłowe, spróbuj ponownie");
    }

     void printUsedLetters(HashSet<String> usedLetters) {
        System.out.println();
        System.out.println("Użyte litery:");
        for (String letter:usedLetters) {
            System.out.print(letter + " ");

        }
        System.out.println();
    }

     void printInsertLetterMessage() {
        System.out.println("Podaj literę: ");
    }

     void printLostGameMessage(char[] word) {
        System.out.println("Przegrałeś! Może następnym razem pójdzie ci lepiej.");
        System.out.println("Poprawne hasło to: "+ new String(word));
    }

     void printGallowsMessage() {
        System.out.println("Szubienica:\n");
    }

     void printInsertPasswordMessage() {
        System.out.println("Podaj hasło:");
    }
}
