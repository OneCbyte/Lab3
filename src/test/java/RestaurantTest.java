package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test
    public void hotDishPriceCalculation() {
        HotDish steak = new HotDish("Стейк", 300, 65);
        assertEquals(530.0, steak.calculatePrice(), 0.001);
    }

    @Test
    public void hotDishPackagingCost() {
        HotDish steak = new HotDish("Стейк", 300, 65);
        assertEquals(115.0, steak.calculatePackagingCost(), 0.001);
    }

    @Test
    public void beveragePriceCalculation() {
        Beverage juice = new Beverage("Морс", 400);
        assertEquals(100.0, juice.calculatePrice(), 0.001);
    }

    @Test
    public void beveragePackagingCost() {
        Beverage juice = new Beverage("Морс", 400);
        assertEquals(25.0, juice.calculatePackagingCost(), 0.001);
    }

    @Test
    public void dessertPriceCalculation() {
        Dessert cheesecake = new Dessert("Чизкейк", 150);
        assertEquals(375.0, cheesecake.calculatePrice(), 0.001);
    }

    @Test
    public void cutlerySetPackagingCost() {
        CutlerySet set = new CutlerySet("Набор", 3);
        assertEquals(45.0, set.calculatePackagingCost(), 0.001);
    }

    @Test
    public void cutlerySetOverriddenDefaultMethod() {
        CutlerySet set = new CutlerySet("Набор", 3);
        assertEquals("Пластиковый бокс для приборов", set.getPackagingType());
    }

    @Test
    public void dishSortingByPrice() {
        Dish d1 = new Dessert("Чизкейк", 150); // 375.0
        Dish d2 = new Beverage("Морс", 400);     // 100.0
        Dish d3 = new HotDish("Стейк", 300, 65); // 530.0

        Dish[] menu = {d1, d2, d3};
        Arrays.sort(menu);

        assertSame(d2, menu[0]); // Самый дешевый — Морс
        assertSame(d1, menu[1]); // Чизкейк
        assertSame(d3, menu[2]); // Самый дорогой — Стейк
    }
}
