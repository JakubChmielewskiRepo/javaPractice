package pl.chmielewski.hangmanGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HangmanHelper {

    String[] wordsArray={"lekkoatletyka","interpunkcja","telekomunikacja","metamorfoza","zwierzchnictwo"," prześladowanie","antyterrorysta","dźwiękonaśladownictwo","antykoncepcja","kolorowanka","konstantynopolitański","lumpenproletariat","luminescencja","magnetoelektryczny","malkontenctwo","primaaprilisowy","pięćdziesięciogroszówka","anatomopatologiczny","deoksyrybonukleinowy",};
    HashSet<String> words=new HashSet<>(20);

    public String randomizeWord() {
        Random rand = new Random();

    String randomizedWord=wordsArray[rand.nextInt(20)];
        System.out.println(randomizedWord);
    return randomizedWord;
    }

    public void readOptionChoseByPlayer() {
        try {
            Scanner scanner = new Scanner(System.in);
            String option=scanner.next();

        }catch (Exception e){
            System.out.println("Niepoprawna instrukcja, spróbuj jeszcze raz");
        }

    }
}
