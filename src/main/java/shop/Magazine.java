package main.java.shop;

import java.util.*;

/**
 * Created by RENT on 2017-08-05.
 */
public class Magazine {
    private Map<PRODUCT_CLASS,List<Product>> productsMap = new HashMap<>();


    void addProduct(String name, double price, PRODUCT_TYPE type, PRODUCT_CLASS prodClass){
        Product product = new Product(prodClass,type,name,price);
        if(productsMap.containsKey(prodClass)){
            productsMap.get(prodClass).add(product);

        }else {
            List<Product> newProductList = new LinkedList<>();
            newProductList.add(product);
            productsMap.put(prodClass,newProductList);
        }
        System.out.println("Dodano produkt");
    }

    void printProductByClass(PRODUCT_CLASS prodClass){
        System.out.println(productsMap.get(prodClass));
    }

    void printProductByType(PRODUCT_TYPE prodType){
        List<Product> filteredProducts = new ArrayList<>();
        for(List<Product> list : productsMap.values()){
            for(Product product : list){
                if(product.getProdType() == prodType){
                    filteredProducts.add(product);
                }
            }
        }
        System.out.println(filteredProducts);

    }


}
