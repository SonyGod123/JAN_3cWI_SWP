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

    public void printFiles(){
        int numberofFiles = this.files.size();
        for (int i = 0; i < numberofFiles; i++) {
            System.out.println(this.files.get(i).getName() + " " + this.files.get(i).getExtension() + " " + this.files.get(i).getSize());
        }
    }
}
