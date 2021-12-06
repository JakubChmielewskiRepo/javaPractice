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
        System.out.println("Zagrajmy w wisielca!");
    }
}
