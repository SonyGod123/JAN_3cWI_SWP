package at.tsj.projects.Fernbedienung;

import at.tsj.projects.Fernbedienung.Objects.Battery;
import at.tsj.projects.Fernbedienung.Objects.Fernbedienung;

public class Main {
    public static void main(String[] args) {
    Battery battery = new Battery(100,100);
    Battery battery2 = new Battery(100,100);
    Fernbedienung fernbedienung = new Fernbedienung(battery,battery2);
        System.out.println(fernbedienung.getStatus());




    }
}

