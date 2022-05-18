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

    public void insertSDCard(SD_Card card){
        this.sd_cards.add(card);
    }

    public void takePicture(){
        // capacity
        //
    }

    //Notes: add Scanner in order to decide if I want to add a sd_card when i haven't got enough space
}
