package at.tsj.projects.Handy;

import at.tsj.projects.Handy.Objects.Camera;
import at.tsj.projects.Handy.Objects.Handy;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera(2,"sony");
        Handy handy = new Handy("violett", "Apple", camera);

        System.out.println(camera.getBrand());
        handy.turnon();
        camera.takepicture();
    }




}
