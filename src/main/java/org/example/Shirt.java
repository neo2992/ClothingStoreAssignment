package org.example;

import org.example.enumerators.ShirtSize;

public class Shirt extends Product{
    private String size;

    public Shirt(String name, String brand, double price, String color, String size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tSize: " + getSize();
    }
}
