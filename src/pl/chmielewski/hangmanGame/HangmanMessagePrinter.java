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
        System.out.println("Twoim zadaniem jest odgadni??cie has??a, liczba znak??w \"_\" odpowiada ilo??ci liter w ha??le.");
        System.out.println("Kiedy podasz liter?? alfabetu a ona zawiera si?? w wyrazie, odpowiedni znak \"_\" zamieni si?? w liter??.");
        System.out.println("Je??eli jednak podana przez ciebie litera alfabetu nie zawiera si?? w ha??le," +
                " wtedy dorysowany zostanie kolejny element szubienicy.");
        System.out.println("Kiedy szubienica zostanie uko??czona, b??d?? podane przez ciebie has??o b??dzie nieprawid??owe, przegrywasz gr??. :(");
        System.out.println("Powodzenia!\n");
    }

     void printNumberOfLetters(String randomizedWord) {
        System.out.println("Has??o zawiera " + randomizedWord.length() + " liter.");
    }

     void printEncryptedWord(char[] hashedWord) {

        for (char letter:hashedWord) {
            System.out.print(letter+" ");
        }
        System.out.println("\n");
    }

     void printPlayerOptions() {
        System.out.println();
        System.out.println("1- Podaj liter??.");
        System.out.println("2- Odgadnij has??o");
        System.out.println("3- Zako??cz gre.");
    }

     void printIncorrectInputMessage() {
        System.out.println("Wprowadzone dane s?? nieprawid??owe, spr??buj ponownie");
    }

     void printUsedLetters(HashSet<String> usedLetters) {
        System.out.println();
        System.out.println("U??yte litery:");
        for (String letter:usedLetters) {
            System.out.print(letter + " ");

        }
        System.out.println();
    }

     void printInsertLetterMessage() {
        System.out.println("Podaj liter??: ");
    }

     void printLostGameMessage(char[] word) {
        System.out.println("Przegra??e??! Mo??e nast??pnym razem p??jdzie ci lepiej.");
        System.out.println("Poprawne has??o to: "+ new String(word));
    }

     void printGallowsMessage() {
        System.out.println("Szubienica:\n");
    }

     void printInsertPasswordMessage() {
        System.out.println("Podaj has??o:");
    }

     void printRestartMessage() {
         System.out.println();
         System.out.println("Wpisz cyfr??: "+" 1 " +"aby zagra?? jeszcze raz, lub cokolwiek innego aby wyj???? z gry." );

    }
}
