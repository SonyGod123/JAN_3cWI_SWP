package at.tsj.projects.Phone.Objects;

import java.util.ArrayList;
import java.util.List;

public class SD_Card {
    private int capacity;
    private List<Phone_File> files;


    public SD_Card(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void addFile(Phone_File file){
        this.files.add(file);
    }

    public List<Phone_File> getAllFiles(){
       return files;
    }


}
