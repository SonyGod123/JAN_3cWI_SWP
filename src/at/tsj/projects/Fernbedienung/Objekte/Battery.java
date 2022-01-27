package at.tsj.projects.Fernbedienung.Objekte;

public class Battery {
    private int Speicherstatus;
    private int Batteriestatus;

    public Battery(int speicherstatus, int batteriestatus) {
        Speicherstatus = speicherstatus;
        Batteriestatus = batteriestatus;
    }

    public void turnOn() {
        this.Batteriestatus = (Batteriestatus - 5);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public int getSpeicherstatus() {
        return Speicherstatus;
    }

    public void setSpeicherstatus(int speicherstatus) {
        Speicherstatus = speicherstatus;
    }

    public int getBatteriestatus() {
        return Batteriestatus;
    }

    public void setBatteriestatus(int batteriestatus) {
        Batteriestatus = batteriestatus;
    }
}
