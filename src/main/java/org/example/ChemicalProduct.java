package org.example;

public class ChemicalProduct extends Product implements ChemicalDo {
    //Interface Segregation Principle - применяем разные интерфейсы для разных категорий товаров, исходя из
    // особенностей их применения.
    //Dependency Inversion Principle - у нас есть класс Product, который отделен от конкретной реализации- продукты химии.
    // Кроме того, мы также создали дополнительную низкоуровневую реализацию абстракции - интерфейс ChemicalDo.
    // В итоге абстракции не зависят от деталей. Детали не зависят от абстракций.
    private final String name = "Средство для мытья посуды";
    private final int price = 210;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void use(ChemicalProduct product) {
        System.out.println("Продукт " + product.getName() + " эффективен в использовании.");
    }
}
