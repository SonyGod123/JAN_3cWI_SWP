package at.tsj.projects.Calculator;

import at.tsj.projects.Calculator.Objects.Calculator;
import at.tsj.projects.Calculator.Objects.Root_Calculator;
import at.tsj.projects.Calculator.Objects.Scientific_Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scientific_Calculator scientific_calculator = new Scientific_Calculator();
        Root_Calculator root_calculator = new Root_Calculator();
        System.out.println(calculator.multiply(1,2));
        System.out.println(scientific_calculator.multiply(1,2));
        System.out.println(scientific_calculator.sin(4));
        System.out.println(calculator.division(3,2));
        System.out.println(root_calculator.addition(5,3));
        System.out.println(root_calculator.root(4));
        System.out.println(root_calculator.substraction(4,5));


    }
}
