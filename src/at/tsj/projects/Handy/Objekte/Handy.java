package at.tsj.projects.Handy.Objekte;

public class Handy {
    private String color;
    private String brand;
    Camera camera;

    public Handy(String color, String brand, Camera camera) {
        this.color = color;
        this.brand = brand;
        this.camera = camera;
    }

    public void turnon() {
        System.out.println("ʕ•́ᴥ•̀ʔっ");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
