package at.tsj.projects.Camera.Objects;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int megapixel;
    private int weight;
    private String color;
    Producer producer;
    private List<SD_Card> sd_cards;

    public Camera(int megapixel, int weight, String color, Producer producer, SD_Card card) {
        this.megapixel = megapixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.sd_cards = new ArrayList<>();
        this.sd_cards.add(card);
    }

    public void insertSDCard(SD_Card card) {
        this.sd_cards.add(card);
    }

    public void printAllSDCards(){
       int size = this.sd_cards.size();
        for (int i = 0; i < size; i++) {
            System.out.println(this.sd_cards.get(i).getCapacity());
        }
    }

    public void takePicture(String name, String date, int size) {
        System.out.println("Making Pictures");
        Picture picture = new Picture(name, date, size);
        //TODO select a sd card
        boolean didSave = false;
        for (SD_Card card : this.sd_cards) {
            if (card.freeSpace()>picture.getSize()){
                card.savePicture(picture);
                didSave = true;
            } else {
                System.out.println("Not enough space on any sd_card");
            }
        }
    }
}
