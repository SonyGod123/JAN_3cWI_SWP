package at.tsj.projects.While;

import java.util.Random;

public class While_Aufgabe_1 {
    public static void main(String[] args) {
        //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
        // Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

        boolean Test = true;
        int sum = 0;

        Random random = new Random();

        while (Test) {
            int low = 10;
            int high = 31;
            int RandomNumber = random.nextInt(high-low)+low;
            System.out.println(RandomNumber);
            sum = sum + RandomNumber;
            if (RandomNumber==15||RandomNumber==25 ){
                Test = false;
                System.out.println(sum);
            }
        }
    }
}
