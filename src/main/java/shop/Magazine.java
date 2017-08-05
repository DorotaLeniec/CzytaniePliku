package main.java.shop;

import java.util.*;

/**
 * Created by RENT on 2017-08-05.
 */
public class Magazine {
    private Map<PRODUCT_CLASS,List<Product>> productsMap = new HashMap<>();

    public Magazine(){
        productsMap.put(PRODUCT_CLASS.HIGH, new ArrayList<>());
        productsMap.put(PRODUCT_CLASS.MEDIUM, new ArrayList<>());
        productsMap.put(PRODUCT_CLASS.LOW, new ArrayList<>());
    }

    void addProduct(String name, double price, PRODUCT_TYPE type, PRODUCT_CLASS prodClass){
        productsMap.get(prodClass).add(new Product(prodClass,type,name, price));
        System.out.println("Dodano produkt");
    }

    void showProductByClass(PRODUCT_CLASS prodClass){
        System.out.println(productsMap.get(prodClass));
    }

    void showProductByType(PRODUCT_TYPE prodType){
        List<Product> products = new ArrayList<>();

    }


}
