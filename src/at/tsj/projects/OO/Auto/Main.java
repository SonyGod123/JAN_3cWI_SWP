package at.tsj.projects.OO.Auto;

import at.tsj.projects.OO.Auto.objects.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.fuelLeft = 70;


        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1234";
        c2.fuelAmount = 20;
        c2.fuelLeft = 20;


  /*      Scanner scanner = new Scanner(System.in);
        int amountofRepetitions = scanner.nextInt();

        for (int i = amountofRepetitions; i > 0; i--) {
            c1.honk();
        }
*/

c2.getRemainingRange();
        c1.drive();
        System.out.println(c1.fuelLeft);
        System.out.println(c1.fuelConsumption);
c1.getRemainingRange();



    }
}
