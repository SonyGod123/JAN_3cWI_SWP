package at.tsj.Test.Objekte;

public class Lamp {
    private LightElement lightElement;
    private LightElement lightElement2;

public void getOverallPowerUsage() {
    System.out.println(lightElement.getEnergyusage()+lightElement2.getEnergyusage());
}

public void printNamesOfLightElements() {
    System.out.println(lightElement.getName()+" "+ lightElement2.getName());
}

public void turnAllOn() {
    lightElement.setState(true);
    lightElement2.setState(true);
}

    public Lamp(LightElement lightElement) {
        this.lightElement = lightElement;
    }

    public LightElement getLightElement() {
        return lightElement;
    }

    public void setLightElement(LightElement lightElement) {
        this.lightElement = lightElement;
    }
}
