package at.tsj.projects.Würfelspiel;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        System.out.println("Drücken sie 6 um, das Spiel zu starten");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();


        if (selection==6) {
            Random random = new Random();

            int szahl = 0;
            int czahl = 0;

            for (int i = 0; i <= 5; i++) {
                int szahl1 = random.nextInt(6)+1;
                szahl = szahl1 + szahl;
                int czahl1 = random.nextInt(6)+1;
                czahl = czahl1 + czahl;
            }
            if (szahl==czahl) {
                System.out.println("Sie haben das unmögliche geschafft, sowohl der Computer als auch der Spieler haben genau gleich viel Gewürfelt!");
            } else if (szahl>czahl){
                System.out.println("Der Spieler hat gewonnen! Gratuliere!");
                System.out.println("Der Spieler hatte: " + szahl);
                System.out.println("Der Computer hatte: " + czahl);
            } else {
                System.out.println("Der Computer hat gewonnen! Schade!");
                System.out.println("Der Spieler hatte: " + szahl);
                System.out.println("Der Computer hatte: " + czahl);
            };


        };


    }
}
