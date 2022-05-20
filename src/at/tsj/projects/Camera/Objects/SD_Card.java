package at.tsj.projects.Camera.Objects;

import java.util.ArrayList;
import java.util.List;

public class SD_Card {
    private int capacity;
    private List<Picture> pictures;

    public SD_Card(int capacity) {
        this.capacity = capacity;
        this.pictures = new ArrayList<>();
    }

    public void savePicture(Picture picture){
        this.pictures.add(picture);

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }
}
