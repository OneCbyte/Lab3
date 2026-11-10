package org.example;

public class Beverage extends Dish implements Packable {

    public Beverage(String name, double volume) {
        super(name, volume);
    }

    @Override
    public double calculatePrice() {
        return 0.25 * getAmount();
    }

    @Override
    public double calculatePackagingCost() {
        return 25.0;
    }
}
