package org.example;

public class HotDish extends Dish implements Packable {
    private int servingTemperature;

    public HotDish(String name, double weight, int servingTemperature) {
        super(name, weight);
        this.servingTemperature = servingTemperature;
    }

    public int getServingTemperature() {
        return servingTemperature;
    }

    @Override
    public double calculatePrice() {
        return 1.5 * getAmount() + 80.0;
    }

    @Override
    public double calculatePackagingCost() {
        return 40.0 + 0.25 * getAmount();
    }
}
