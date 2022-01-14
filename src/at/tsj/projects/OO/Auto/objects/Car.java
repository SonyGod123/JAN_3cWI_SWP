package at.tsj.projects.OO.Auto.objects;

public class Car {
    //Instanz /Gedächtnisveriabelen

    //don't do that later
    public float fuelConsumption;
    public float fuelAmount;
    public float fuelLeft;
    public String brand;
    public String serialNumber;
    private String color;


//Methoden
    public void drive() {
        this.fuelLeft = this.fuelLeft-fuelConsumption;
        System.out.println("I am driving");
    };

    public void break1() {
        System.out.println("Ich bremse");
    };

    public void turboBoost() {
    if (fuelLeft>fuelAmount*0.1) {
        System.out.println("SuperBoostMode");
    }
    else {
        System.out.println("Not enough fuel to go Superboost");
    }
    }

    public void honk() {
        System.out.println("Tuuut");
    }

    public void getRemainingRange() {
        float Range = fuelLeft / fuelConsumption * 100;
        System.out.println(Range+" km");
    }
}
