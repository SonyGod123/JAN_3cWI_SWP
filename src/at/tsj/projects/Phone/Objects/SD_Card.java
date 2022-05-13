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
        if (getFreeSpace()>=file.getSize()) {
            this.files.add(file);
        } else {
            System.out.println("Not enough storage");
        }
    }

    public List<Phone_File> getAllFiles(){
     return files;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Phone_File> getFiles() {
        return files;
    }

    public void setFiles(List<Phone_File> files) {
        this.files = files;
    }

    public int getFreeSpace(){
        int numberofFiles = this.getAllFiles().size();
        int sizeOfFiles = 0;
        for (int i = 0; i < numberofFiles; i++) {
            sizeOfFiles = sizeOfFiles + this.getAllFiles().get(i).getSize();
        }

        int freeSpace = this.getCapacity() - sizeOfFiles;

        return freeSpace;
    }
}
