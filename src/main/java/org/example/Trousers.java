package org.example;

import org.example.enumerators.JacketAndTrousersSize;

public class Trousers extends Product {

    private int size;

    public Trousers(String name, String brand, double price, String color, int size) {
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
