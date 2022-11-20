package org.example;

import org.example.enumerators.ShoesSize;

public class Shoes extends Product{
    private int size;

    public Shoes(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tSize: " + getSize();
    }
}
