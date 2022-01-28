package at.tsj.Test;

import at.tsj.Test.Objekte.Lamp;
import at.tsj.Test.Objekte.LightElement;

public class Main {

    public static void main(String[] args) {
        Lamp lamp = new Lamp(LightElement);
       LightElement lightElement = new LightElement("lampe","blau",5,false);
       LightElement lightElement2 = new LightElement("lamp2","red",10,false);

       lamp.printNamesOfLightElements();


    }
}
