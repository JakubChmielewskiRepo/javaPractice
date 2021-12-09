package pl.chmielewski.hangmanGame;

import java.util.HashSet;
import java.util.Random;

public class HangmanHelper {

    String[] wordsArray={"lekkoatletyka","interpunkcja","telekomunikacja","metamorfoza","zwierzchnictwo"," prześladowanie","antyterrorysta","dźwiękonaśladownictwo","antykoncepcja","kolorowanka","konstantynopolitański","lumpenproletariat","luminescencja","magnetoelektryczny","malkontenctwo","primaaprilisowy","pięćdziesięciogroszówka","anatomopatologiczny","deoksyrybonukleinowy",};
    HashSet<String> words=new HashSet<>(20);

    public String randomizeWord() {
        Random rand = new Random();

    String randomizedWord=wordsArray[rand.nextInt(20)];
        System.out.println(randomizedWord);
    return randomizedWord;
    }
}
