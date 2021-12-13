package pl.chmielewski.hangmanGame;

import java.util.Random;
import java.util.Scanner;

 class HangmanGameHelper {

    private String[] wordsArray={"lekkoatletyka","interpunkcja","telekomunikacja","metamorfoza","zwierzchnictwo"," prześladowanie","antyterrorysta","dźwiękonaśladownictwo","antykoncepcja","kolorowanka","konstantynopolitański","lumpenproletariat","luminescencja","magnetoelektryczny","malkontenctwo","primaaprilisowy","pięćdziesięciogroszówka","anatomopatologiczny","deoksyrybonukleinowy"};

     String randomizeWord() {
        Random rand = new Random();

    String randomizedWord=wordsArray[rand.nextInt(19)];
    return randomizedWord;
    }

     String readPlayerInput() {
        String input="";
            Scanner scanner = new Scanner(System.in);
           input=scanner.next();
        return input;
    }

     static void clearConsole() {
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

     boolean checkIfLetterIsCorrect(String letter, Hangman hangman) {
        return hangman.getAlphabet().contains(letter);
    }
}
