package main.java.shop;

/**
 * Created by RENT on 2017-08-05.
 */
public class Product {
    private PRODUCT_CLASS prodClass;
    private PRODUCT_TYPE prodType;
    private String prodName;

    public PRODUCT_CLASS getProdClass() {
        return prodClass;
    }

    public PRODUCT_TYPE getProdType() {
        return prodType;
    }

    public String getProdName() {
        return prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    private double prodPrice;

    public Product(PRODUCT_CLASS prodClass, PRODUCT_TYPE prodType, String prodName, double prodPrice) {
        this.prodClass = prodClass;
        this.prodType = prodType;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }
}
