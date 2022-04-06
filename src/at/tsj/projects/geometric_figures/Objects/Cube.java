package at.tsj.projects.geometric_figures.Objects;

public class Cube extends Figure {

    private double a;

    public Cube(double a, String name) {
        this.a = a;
        super.setName(name);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        double Area = Math.pow(a,3);
        return Area;
    }

}
