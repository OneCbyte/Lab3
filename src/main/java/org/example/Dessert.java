package org.example;

public class Dessert extends Dish {

    public Dessert(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double calculatePrice() {
        return 2.5 * getAmount();
    }
}
