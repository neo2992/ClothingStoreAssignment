package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;

public class Cashier {
    Cart cart;

    public Cashier(Cart cart) {
        this.cart = cart;
    }

    public int numOfProducts(Cart cart) {
        return cart.getProducts().size();
    }

    public double discountByQuantity(Cart cart) {
        if (numOfProducts(cart) >= 3) {
           return 0.2;
        }
        return 0;
    }

    public double discountByDay(Product product) {
        if (cart.getDateOfPurchase().getDayOfWeek() == DayOfWeek.TUESDAY) {
           if (product instanceof Shoes) {
               return 0.25;
           } else if (product instanceof Shirt) {
               return 0.1;
           }
        }
        return 0;
    }

    public double maxDiscount(Product product) {
        if (product instanceof Shoes || product instanceof Shirt) {
            return Math.max(discountByDay(product), discountByQuantity(cart));
        }
        return discountByQuantity(cart);
    }

    public double sumDiscount(Cart cart) {
        double totalDiscount = 0;
        for (var product : cart.getProducts()) {
           totalDiscount += BigDecimal.valueOf(product.getPrice() * maxDiscount(product)).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        return totalDiscount;
    }

    public void printReceipt(Cart cart) {
        System.out.println("\nDate: " + cart.getDateOfPurchase());
        System.out.println("---Products---");
        for (var product : cart.getProducts()) {
            System.out.println('\n' + product.getName() + " - " + product.getBrand() + "\n$" + product.getPrice());
            if (maxDiscount(product) != 0) {
                System.out.println("#discount " + ((int) (maxDiscount(product) * 100)) + "%-$" + (BigDecimal.valueOf(product.getPrice() * maxDiscount(product))).setScale(2, RoundingMode.HALF_UP).doubleValue());
            }
        }
        System.out.println("SUBTOTAL: " + cart.sumOfPrice());
        System.out.println("DISCOUNT: " + sumDiscount(cart));
        System.out.println("TOTAL: " + (cart.sumOfPrice() - sumDiscount(cart)));
    }
}