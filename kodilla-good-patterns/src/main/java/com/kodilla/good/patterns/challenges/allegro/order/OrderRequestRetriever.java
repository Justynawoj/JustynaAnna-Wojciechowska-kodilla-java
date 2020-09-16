package com.kodilla.good.patterns.challenges.allegro.order;

import com.kodilla.good.patterns.challenges.allegro.models.Product;
import com.kodilla.good.patterns.challenges.allegro.models.User;

import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("Wilma", "Kowalska", "wilma-239","mickiewicza 8");
        LocalDateTime orderDate = LocalDateTime.of(2020,5,15,15,15,10);
        HashMap<Product,Integer> productsOrdered = new HashMap<>();
        productsOrdered.put(Product.BEER,10);
        productsOrdered.put(Product.CAT_FOOD,5);

        return new OrderRequest(user,orderDate,productsOrdered);
    }
}
