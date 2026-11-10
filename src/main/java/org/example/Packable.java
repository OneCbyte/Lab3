package org.example;

public interface Packable {
    double calculatePackagingCost();

    default String getPackagingType() {
        return "Стандартная упаковка";
    }
}
