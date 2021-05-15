package com.poly;

public class Product_NoTax extends Product{
    public Product_NoTax(){
        super();
    }

    public Product_NoTax(String name, double price) {
        super.setName(name);
        super.setPrice(price);
    }
    
    @Override
    public double getImportTax(){
        return 0;
    }
}
