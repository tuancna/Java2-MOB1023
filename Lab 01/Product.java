package com.poly;

interface DAO{
    void insert();
    void update();
    void delete();
    void select();
}

public class Product implements DAO{
    private String name;
    private double price;

    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getImportTax(){
        return this.getPrice() * 10 / 100;
    }
    
    public void inputProduct(){
        System.out.print("> Nhập tên sản phẩm: ");
        this.setName(Function.sInput());
        System.out.print("> Nhập giá sản phẩm: ");
        this.setPrice(Function.dInput());
    }
    
    public void outputProduct(){
        System.out.printf("%-30s%-15s%-15s\n", this.getName(), String.format("%,.1f",this.getPrice()), String.format("%,.1f",this.getImportTax()));
    }

    @Override
    public void insert() {
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void update() {
        System.out.println("Cập nhật thành công!");
    }

    @Override
    public void delete() {
        System.out.println("Xóa thành công!");
    }

    @Override
    public void select() {
        System.out.println("Chọn lựa thành công!");
    }
}
