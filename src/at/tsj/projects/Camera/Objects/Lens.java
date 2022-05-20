package at.tsj.projects.Camera.Objects;

public class Lens {
    Lens_Producer lens_producer;
    private int focal_length;

    public Lens_Producer getLens_producer() {
        return lens_producer;
    }

    public void setLens_producer(Lens_Producer lens_producer) {
        this.lens_producer = lens_producer;
    }

    public int getFocal_length() {
        return focal_length;
    }

    public void setFocal_length(int focal_length) {
        this.focal_length = focal_length;
    }
}
