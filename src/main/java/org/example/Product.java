package org.example;

public abstract class Product {
    private int expirationDate;
    private int weight;
    private String country;
    private int price;
    private String name;
    private int count;

    public int getWeight() {
        return weight;
    }

    public String getCountry() {
        return country;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

