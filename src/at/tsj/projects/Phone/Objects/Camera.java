package at.tsj.projects.Phone.Objects;

public class Camera {
    private String resolution;

    public Camera(String resolution) {
        this.resolution = resolution;
    }

    public Phone_File makePicture(String extension, int size, String name){
        System.out.println("Making Picture");
        Phone_File phone_file = new Phone_File(extension,size,name);
        return phone_file;
    }
}
