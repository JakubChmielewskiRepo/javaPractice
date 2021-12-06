package pl.chmielewski.hangmanGame;

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
}
