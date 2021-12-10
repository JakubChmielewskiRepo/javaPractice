package pl.chmielewski.hangmanGame;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HangmanGameHelper {

    private String[] wordsArray={"lekkoatletyka","interpunkcja","telekomunikacja","metamorfoza","zwierzchnictwo"," prześladowanie","antyterrorysta","dźwiękonaśladownictwo","antykoncepcja","kolorowanka","konstantynopolitański","lumpenproletariat","luminescencja","magnetoelektryczny","malkontenctwo","primaaprilisowy","pięćdziesięciogroszówka","anatomopatologiczny","deoksyrybonukleinowy",};

    public String randomizeWord() {
        Random rand = new Random();

    String randomizedWord=wordsArray[rand.nextInt(19)];
        System.out.println(randomizedWord);
    return randomizedWord;
    }

    public String readPlayerInput() {
        String input="";
            Scanner scanner = new Scanner(System.in);
           input=scanner.next();
        return input;
    }

    public boolean checkIfOptionIsCorrect(String choseOption) {
        if (choseOption.equals("1") || choseOption.equals("2") || choseOption.equals("3") || choseOption.equals("4")){
            return true;
        }
        return false;
    }

    public static void clearConsole() {
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

    public boolean checkIfLetterIsCorrect(String letter, Hangman hangman) {
        return hangman.getAlphabet().contains(letter);
    }
}
