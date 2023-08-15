package com.mjc.stage2;


import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    // Write your code here!
    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy){
        return (List<Product>) productList.stream().filter(filteringStrategy::filter);
    }
}
