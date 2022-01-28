package at.tsj.Test.Objekte;

public class LightElement {
    private String name;
    private String color;
    private int energyusage;
    private boolean state;

public void turnOn() {
    if (this.state == true) {
        System.out.println("Mein Name ist " + getName() + "." + "Ich bin bereits eingeschalten");
    }
    else {
        this.state = state = true;
    }
    this.energyusage = energyusage + 5;
}
    public void turnOff() {
    this.state = false;
}



    public LightElement(String name, String color, int energyusage, boolean state) {
        this.name = name;
        this.color = color;
        this.energyusage = energyusage;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnergyusage() {
        return energyusage;
    }

    public void setEnergyusage(int energyusage) {
        this.energyusage = energyusage;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
