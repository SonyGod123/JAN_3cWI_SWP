package at.tsj.projects.Phone.Objects;

public class Phone {
    private String color;
    private SIM sim;
    private Camera camera;
    private SD_Card sd_card;

    public Phone(String color, SIM sim, Camera camera, SD_Card sd_card) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sd_card = sd_card;
    }

    public void makeCall(String number) {
        this.sim.doCall(number);
    }

    public void takePicture(String extension,int size, String name) {
        Phone_File file = this.camera.makePicture(extension, size, name);
        this.sd_card.addFile(file);
    }

}
