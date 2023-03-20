package org.example;

public class FoodProduct extends Product implements FoodDo {
    //Open Closed Principle - имплементируя интерфейс FoodDo мы добавляем
    // классу дополнительную функцию, не меняя изначальный код.
    // Single Responsibility Principle- мы видим, что класс описывает конкретные продукты-еду.
    private final String name = "Торт";
    private final int price = 3000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void taste(FoodProduct product) {
        System.out.println("У продукта " + product.getName() + " сладкий вкус");
    }
}
