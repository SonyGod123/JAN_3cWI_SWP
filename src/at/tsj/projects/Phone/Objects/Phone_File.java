package at.tsj.projects.Phone.Objects;

public class Phone_File {
    private String extension;
    private int size;
    private String name;

    public Phone_File(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public void getInfo(){
        System.out.println(this.name + " " + this.extension + " " + this.size);
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
