package at.tsj.Test.coffeeMachine.Objects;

public class coffee {
    private int size;
    private int strength;

    public coffee(int size, int strength) {
        this.size = size;
        this.strength = strength;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
