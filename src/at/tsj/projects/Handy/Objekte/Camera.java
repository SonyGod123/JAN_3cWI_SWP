package at.tsj.projects.Handy.Objekte;

public class Camera {
    private int id;
    private String brand;

    public Camera(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public void takepicture() {
        System.out.println("( ͡ಠ ͜ʖ ͡ಠ)");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
