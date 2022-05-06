package at.tsj.projects.Phone;

import at.tsj.projects.Phone.Objects.*;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM(2,"0664300");
        Camera camera = new Camera("12MP");

        SD_Card sd_card = new SD_Card(50);
        Phone_File phone_file = new Phone_File("png",2,"Tanzen");
        sd_card.addFile(phone_file);

        Phone phone = new Phone("black",sim,camera,sd_card);
        phone.makeCall("50033");
        phone.takePicture("jpg",20,"Test");
        phone_file.getInfo();
        phone.printAllFiles();
    }

}
