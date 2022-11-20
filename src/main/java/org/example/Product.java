package org.example;

public abstract class Product {
    private String name;
    private String brand;
    private double price;
    private String color;

    public Product(String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " :\n" +
                "\tName: " + getName() + ",\n" +
                "\tBrand: " + getBrand() + ",\n" +
                "\tPrice: $" + getPrice() + ",\n" +
                "\tColor: " + getColor();
    }
}
