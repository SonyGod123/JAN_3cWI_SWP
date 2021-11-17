package at.tsj.projects.Loops;

// Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.
public class Loops_Aufgabe_2 {
    public static void main(String[] args) {
        int sum = 2;
        for (int i = 2; i <= 1000; i = i + 2) {
        sum = sum + i;
            System.out.println(sum);
        }

    }
}
