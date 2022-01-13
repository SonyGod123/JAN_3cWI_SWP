package at.tsj.projects.OO.Auto.objects;

public class Car {
    //Instanz /Gedächtnisveriabelen

    //don't do that later
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

//Methoden
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }
}
