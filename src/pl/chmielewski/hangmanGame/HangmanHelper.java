package pl.chmielewski.hangmanGame;

import java.util.HashSet;
import java.util.Random;

public class HangmanHelper {

    String[] wordsArray={"lekkoatletyka","interpunkcja","telekomunikacja","metamorfoza","zwierzchnictwo"," prześladowanie","antyterrorysta","dźwiękonaśladownictwo","antykoncepcja","kolorowanka","konstantynopolitański","lumpenproletariat","luminescencja","magnetoelektryczny","malkontenctwo","primaaprilisowy","pięćdziesięciogroszówka","anatomopatologiczny","deoksyrybonukleinowy",};
    HashSet<String> words=new HashSet<>(20);

    public void randomizeWord() {
        Random rand = new Random();

    String randomizedWord=wordsArray[rand.nextInt(25)];
        System.out.println(randomizedWord);

    }
}
