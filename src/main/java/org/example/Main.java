package org.example;

import org.example.prototype.PriceList;
import org.example.prototype.Product;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        PriceList priceList = new PriceList("Lista Normal");
        List<Product> productList = List.of(new Product("Arepas", 11000),
                new Product("Pizzas", 15000),
                new Product("Sandwichs", 12000),
                new Product("Limonadas", 5000));
        priceList.setProductList(productList);

        System.out.println(priceList);

        PriceList priceList1 = (PriceList) priceList.deepClone();
        priceList1.setName("lista Preferencial");


        for (Product product : priceList1.getProductList()) {
            product.setPrice(product.getPrice() * 0.05);
        }

        System.out.println(priceList1);


        PriceList priceList2 = (PriceList) priceList.clone();
        priceList2.setName("Lista VIP");

        for (Product product : priceList2.getProductList()) {
            product.setPrice(product.getPrice() * 0.8);
        }

        System.out.println(priceList2);
    }

}
