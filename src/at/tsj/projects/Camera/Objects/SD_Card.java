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
}
