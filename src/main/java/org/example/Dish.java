package org.example;

public abstract class Dish implements Comparable<Dish> {
    private String name;
    private double amount;

    public Dish(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double calculatePrice();

    public String getFullInfo() {
        return name + " - Цена: " + calculatePrice() + " руб.";
    }

    @Override
    public int compareTo(Dish other) {
        return Double.compare(this.calculatePrice(), other.calculatePrice());
    }
}
