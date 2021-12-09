package pl.chmielewski.hangmanGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HangmanGameHelper {

    String[] wordsArray={"lekkoatletyka","interpunkcja","telekomunikacja","metamorfoza","zwierzchnictwo"," prześladowanie","antyterrorysta","dźwiękonaśladownictwo","antykoncepcja","kolorowanka","konstantynopolitański","lumpenproletariat","luminescencja","magnetoelektryczny","malkontenctwo","primaaprilisowy","pięćdziesięciogroszówka","anatomopatologiczny","deoksyrybonukleinowy",};
    HashSet<String> words=new HashSet<>(20);

    public String randomizeWord() {
        Random rand = new Random();

    String randomizedWord=wordsArray[rand.nextInt(20)];
        System.out.println(randomizedWord);
    return randomizedWord;
    }

    public String readPlayerInput() {
        String input="";
            Scanner scanner = new Scanner(System.in);
           input=scanner.next();
        return input;
    }
}
