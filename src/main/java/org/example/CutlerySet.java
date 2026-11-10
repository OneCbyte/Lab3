package org.example;

public class CutlerySet implements Packable {
    private String name;
    private int itemsCount;

    public CutlerySet(String name, int itemsCount) {
        this.name = name;
        this.itemsCount = itemsCount;
    }

    public String getName() {
        return name;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    @Override
    public double calculatePackagingCost() {
        return 15.0 * itemsCount;
    }

    @Override
    public String getPackagingType() {
        return "Пластиковый бокс для приборов";
    }
}
