package at.tsj.Test.coffeeMachine;

import java.util.Scanner;

import at.tsj.Test.coffeeMachine.Objects.*;

public class main {
    public static void main(String[] args) {
        watertank watertank = new watertank(1000);
        int watertank1 = 1000;
        int beans1 = 500;
        coffee coffee = new coffee(50,6);
        coffeeContainer coffeeContainer = new coffeeContainer("c1",5);
        coffeeMachine coffeeMachine = new coffeeMachine("coffee machine","Nescafe",watertank,coffeeContainer,coffee);
        boolean beanContainer = false;
        boolean waterTankfuel = false;
        boolean turnOn = false;
        int coffees = 0;
        int coffeest = 0;



        boolean Vorgang = true;
        while (Vorgang) {
            System.out.println("Choose an option");
            System.out.println("1. Turn On");
            System.out.println("2. Size of coffee");
            System.out.println("3. Strength of coffee");
            System.out.println("4. Refill water");
            System.out.println("5 Refill beans");
            System.out.println("6 Let coffee out");
            System.out.println("7 Turn off");


            Scanner scanner = new Scanner(System.in);

            int selection = scanner.nextInt();;
            System.out.println(selection);

            switch (selection) {
                case 1:
                    System.out.println("The coffee machine turns on");
                    turnOn = true;
                    System.out.println("Do You want to continue?");
                    System.out.println("1 = Yes");
                    System.out.println("2 = No");

                    int con = scanner.nextInt();
                    if (con == 1) {
                        break;
                    } else if (con == 2) {
                        Vorgang = false;
                    }
                    break;

                case 2:
                    System.out.println("Please enter the size of the coffee between 40 and 200 ml");
                    int coffeesize = scanner.nextInt();
                    if (coffeesize>=40&&coffeesize<=200){
                        System.out.println(coffeesize);
                        coffees = coffeesize;
                    } else {
                        System.out.println("Your input is not in the definition range");
                    }
                    break;
                case 3:
                    System.out.println("Please enter the strength of the coffee between 1 and 10");
                    int coffeestregth = scanner.nextInt();
                    if (coffeestregth>=1&&coffeestregth<=10) {
                        System.out.println(coffeestregth);
                        coffeest = coffeestregth;
                        System.out.println(coffeest);
                    } else {
                        System.out.println("Your input is not in the definition range");
                    }
                    break;

                case 4:
                    System.out.println("Water is being refilled");
                    waterTankfuel = true;

                    break;

                case 5:
                    System.out.println("Beans are being refilled");
                    beanContainer = true;
                    break;


                case 6:
                    if (turnOn && waterTankfuel && beanContainer && coffees > 0 && coffeest > 0) {
                        System.out.println("Coffee is being made");
                        watertank1 = watertank1 - coffees;
                        beans1 = beans1 - 20;
                        System.out.println("Successful");

                    } else {
                        System.out.println("There has been an error");
                        System.out.println("There are different things that need to be done");
                        System.out.println("You need to enter the coffee size");
                        System.out.println("You need to enter the coffee strength");
                        System.out.println("Turn on the coffee machine");
                        System.out.println("The watertank need to be refilled");
                        System.out.println("The beans need to be refilled");
                    }
                    break;

                case 7:
                    System.out.println("coffee machine is turned off");
                    Vorgang = false;
                    break;
            };
        }
    }

}
