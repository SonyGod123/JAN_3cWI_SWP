package at.tsj.projects.Camera;

import at.tsj.projects.Camera.Objects.Camera;
import at.tsj.projects.Camera.Objects.Lens_Producer;
import at.tsj.projects.Camera.Objects.Producer;
import at.tsj.projects.Camera.Objects.SD_Card;

public class main
{
    public static void main(String[] args) {
        Producer producer = new Producer("Sony","America");
        Lens_Producer lens_producer = new Lens_Producer("Sony", "Polen");
        SD_Card card = new SD_Card(2000);
        SD_Card card2 = new SD_Card(100);
        Camera camera = new Camera(20,50,"black",producer,card);
        camera.insertSDCard(card2);
        camera.printAllSDCards();

        camera.takePicture("Hobby","2324",10);
    }
}
