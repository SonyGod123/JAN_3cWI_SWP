package at.tsj.projects.Fernbedienung.Objects;

public class Fernbedienung {
    private Battery battery;
    private Battery battery2;

    public Fernbedienung(Battery battery, Battery battery2) {
        this.battery = battery;
        this.battery2 = battery2;
    }

    public double getStatus() {
      return (battery.getBatteriestatus()+battery2.getBatteriestatus())/2;
  }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Battery getBattery2() {
        return battery2;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }
}
