package at.tsj.projects.Cars;

import at.tsj.projects.Cars.Objekte.Car;
import at.tsj.projects.Cars.Objekte.Engine;
import at.tsj.projects.Cars.Objekte.Producer;
import at.tsj.projects.Cars.Objekte.Truck;

public class Main {
    public static void main(String[] args) {
       Producer producer = new Producer("Mercedes","Germany",10);
       Engine engine = new Engine(Engine.TYPE.DIESEL,50);
       Car car = new Car("blue",500,200000,10,60000,engine,producer);

       car.discount();
       car.Consumption();
        Engine engine1 = new Engine(Engine.TYPE.DIESEL, 300);
        Producer producer1 = new Producer("Mercedes","Germany",10);

        Truck t1 = new Truck("red",500,2000000,6.5,4, engine1, producer1, "trailer" );
        System.out.println(t1.getTrailer());

        t1.drive();
    }

}
