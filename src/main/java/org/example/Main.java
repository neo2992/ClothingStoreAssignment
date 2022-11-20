package org.example;

import org.example.enumerators.JacketAndTrousersSize;
import org.example.enumerators.ShirtSize;
import org.example.enumerators.ShoesSize;

import java.time.LocalDateTime;

public class Main {

    public static void Example1() {
        Shirt shirt1 = new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue", ShirtSize.MEDIUM.getSizeIndicator());
        Shirt shirt2 = new Shirt("White Cotton Shirt", "BrandS", 15.99, "white", ShirtSize.MEDIUM.getSizeIndicator());
        Trousers trousers1 = new Trousers("Black Cotton Trousers", "BrandT", 29.99, "black", JacketAndTrousersSize.SIZE_50.getSizeIndicator());
        Shoes shoes1 = new Shoes("Black Leather Shoes", "BrandS", 59.99, "black", ShoesSize.SIZE_43.getSizeIndicator());
        SuitJacket jacket1 = new SuitJacket("Black Cotton Suit Jacket", "BrandJ", 99.99, "black", JacketAndTrousersSize.SIZE_50.getSizeIndicator());

        Cart cart1 = new Cart();
        cart1.addToCart(shirt1); cart1.addToCart(shirt2); cart1.addToCart(trousers1); cart1.addToCart(shoes1); cart1.addToCart(jacket1);
        cart1.setDateOfPurchase(LocalDateTime.of(2022, 2, 2, 12, 34, 56));

        Cashier cashier = new Cashier(cart1);
        cashier.printReceipt(cart1);
    }

    public static void Example2() {
        Shirt shirt1 = new Shirt("Black Silk Shirt", "BrandS", 29.99, "black", ShirtSize.LARGE.getSizeIndicator());
        Shirt shirt2 = new Shirt("White Silk Shirt", "BrandS", 29.99, "white", ShirtSize.LARGE.getSizeIndicator());

        Cart cart1 = new Cart();
        cart1.addToCart(shirt1); cart1.addToCart(shirt2);
        cart1.setDateOfPurchase(LocalDateTime.of(2022, 2, 1, 12, 34, 56));

        Cashier cashier = new Cashier(cart1);
        cashier.printReceipt(cart1);
    }

    public static void Example3() {
        Trousers trousers1 = new Trousers("Red Linen Trousers", "BrandT", 49.99, "red", JacketAndTrousersSize.SIZE_56.getSizeIndicator());
        Shoes shoes1 = new Shoes("Red Suede Shoes", "BrandS", 59.99, "red", ShoesSize.SIZE_44.getSizeIndicator());
        Shoes shoes2 = new Shoes("Black Suede Shoes", "BrandS", 59.99, "black", ShoesSize.SIZE_44.getSizeIndicator());
        SuitJacket jacket1 = new SuitJacket("Red Linen Suit Jacket", "BrandJ", 99.99, "red", JacketAndTrousersSize.SIZE_56.getSizeIndicator());
        Shirt shirt1 = new Shirt("White Linen Shirt", "BrandS", 29.99, "white", ShirtSize.LARGE.getSizeIndicator());

        Cart cart1 = new Cart();
        cart1.addToCart(trousers1); cart1.addToCart(shoes1); cart1.addToCart(shoes2); cart1.addToCart(jacket1); cart1.addToCart(shirt1);
        cart1.setDateOfPurchase(LocalDateTime.of(2022, 2, 1, 12, 34, 56));

        Cashier cashier = new Cashier(cart1);
        cashier.printReceipt(cart1);
    }

    public static void main(String[] args) {

        Example1();
        Example2();
        Example3();
    }
}