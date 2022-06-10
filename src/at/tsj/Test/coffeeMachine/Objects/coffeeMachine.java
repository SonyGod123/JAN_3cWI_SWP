package at.tsj.Test.coffeeMachine.Objects;

public class coffeeMachine {
    private String name;
    private String company;
    private watertank watertank;
    private coffeeContainer coffeeContainer;
    private coffee coffee;

    public coffeeMachine(String name, String company, at.tsj.Test.coffeeMachine.Objects.watertank watertank, at.tsj.Test.coffeeMachine.Objects.coffeeContainer coffeeContainer, at.tsj.Test.coffeeMachine.Objects.coffee coffee) {
        this.name = name;
        this.company = company;
        this.watertank = watertank;
        this.coffeeContainer = coffeeContainer;
        this.coffee = coffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public at.tsj.Test.coffeeMachine.Objects.watertank getWatertank() {
        return watertank;
    }

    public void setWatertank(at.tsj.Test.coffeeMachine.Objects.watertank watertank) {
        this.watertank = watertank;
    }

    public at.tsj.Test.coffeeMachine.Objects.coffeeContainer getCoffeeContainer() {
        return coffeeContainer;
    }

    public void setCoffeeContainer(at.tsj.Test.coffeeMachine.Objects.coffeeContainer coffeeContainer) {
        this.coffeeContainer = coffeeContainer;
    }
}
