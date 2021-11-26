package at.tsj.schoolcheck;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PhraseGenerator {
    public static void main(String[] args) {

        System.out.println("Wieviele Sätze sie denn gerne?");

        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();;


        String[] array1 = {"Er ", "Sie "};
        String[] array2 = {"geht ", "rennt ", "fährt "};
        String[] array3 = {"nach Hause", "zur Schule", "ins Büro", "zur Party"};


        for (int i = 0; i < selection; i++) {
            Random random = new Random();
            int randomNumberarray1 = random.nextInt(array1.length);
            int randomNumberarray2 = random.nextInt(array2.length);
            int randomNumberarray3 = random.nextInt(array3.length);

            System.out.println(array1[randomNumberarray1]+ array2[randomNumberarray2]+array3[randomNumberarray3]);
        }
    }
}
