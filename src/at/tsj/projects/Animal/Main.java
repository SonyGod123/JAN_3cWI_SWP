package at.tsj.projects.Animal;

import at.tsj.projects.Animal.Objects.Animal;
import at.tsj.projects.Animal.Objects.Dog;
import at.tsj.projects.Animal.Objects.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40,20);
        Animal a2 = new Animal(50,30);

        Zoo zoo = new Zoo("Kinderzoo","Elefantenstrasse");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimals();

        Dog d1 = new Dog(15,20);

        zoo.addAnimal(d1);
        zoo.printAnimals();

        d1.bark();
    }
}
