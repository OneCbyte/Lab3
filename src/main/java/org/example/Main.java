package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Karuchkin, prpp2");

        /*
         Обоснование архитектуры:
         Базовый класс Dish сделан абстрактным, поскольку у него нет собственного уникального правила
         расчета стоимости, а создавать аьсрактное блюдо в ресторанной системе не имеет смысла.
         Контракт Packable вынесен в интерфейс, так как возможность упаковки на вынос является опциональным
         поведением для абсолютно разных сущностей. ее поддерживают некоторые блюда и сопутствующие товары вроде приборов,
         в то время как десерты упаковывать нельзя. Интерфейс позволяет объединить эти разнородные объекты
         в один массив для подсчета стоимости упаковки всего заказа без жесткой привязки к иерархии блюд.
        */

        HotDish steak = new HotDish("Стейк", 300, 65);
        Beverage juice = new Beverage("Морс", 400);
        Dessert cheesecake = new Dessert("Чизкейк", 150);

        Dish[] menu = new Dish[] { steak, juice, cheesecake };

        System.out.println("\n=== Исходное меню ===");
        for (Dish dish : menu) {
            System.out.println(dish.getFullInfo());
        }

        Arrays.sort(menu);

        System.out.println("\n=== Меню, отсортированное по цене ===");
        for (Dish dish : menu) {
            System.out.println(dish.getFullInfo());
        }

        Packable[] orderToGo = new Packable[] {
                steak,
                juice,
                new CutlerySet("Набор", 3)
        };

        System.out.println("\n=== Детали упаковки заказа на вынос ===");
        double totalPackagingCost = 0;
        for (Packable item : orderToGo) {
            double cost = item.calculatePackagingCost();
            totalPackagingCost += cost;
            System.out.println(item.getPackagingType() + " - Стоимость: " + cost + " руб.");
        }
        System.out.println("Общая стоимость упаковки заказа: " + totalPackagingCost + " руб.");
    }
}
