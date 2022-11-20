package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();
    private LocalDateTime dateOfPurchase;

    public Cart() {
    }

    public Cart(ArrayList<Product> products, LocalDateTime dateOfPurchase) {
        this.products = products;
        this.dateOfPurchase = dateOfPurchase;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }


    public void addToCart(Product product) {
        products.add(product);
    }

    public double sumOfPrice() {
        double sum = 0;
        for (var product : products) {
            sum += product.getPrice();
        }
        return BigDecimal.valueOf(sum).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        return "Products in the cart: " + products +
                "\nDate and time of purchase: " + dateOfPurchase;
    }
}
