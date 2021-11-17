package at.tsj.projects.Bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int Kontostand = 0;
        boolean Vorgang = true;

        while (Vorgang) {
            System.out.println("Wählen sie eine Option");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");


            Scanner scanner = new Scanner(System.in);

            int selection = scanner.nextInt();;
            System.out.println(selection);



            switch (selection) {
                case 1:
                    System.out.println("Wieviel Geld wollen Sie einzahlen?");
                    int einzahlen = scanner.nextInt();
                    Kontostand = Kontostand + einzahlen;
                    System.out.println(einzahlen + "€" + " wurden eingezahlt ");
                    break;
                case 2:
                    System.out.println("Wieviel Geld wollen Sie abheben");
                    int abheben = scanner.nextInt();
                    Kontostand = Kontostand - abheben;
                    System.out.println(abheben + "€" + " wurden abgehoben");
                    break;
                case 3:
                    System.out.println("Ihr Kontostand beträgt: " + Kontostand);
                    break;
                case 4:
                    System.out.println("Der Vorgang wird beendet");
                    Vorgang = false;
                    break;
            };
        }
    }
        };


