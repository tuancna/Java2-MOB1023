package com.poly;

import java.util.ArrayList;

public class ps15194_lab01 {
    public static void ex1_2(){
        ArrayList<Product> product = new ArrayList();
        
        Product tmp1 = new Product("iPhone 12 Pro Max 256GB", 35190000);
        Product tmp2 = new Product("Samsung Galaxy Note 20", 15990000);
        Product tmp3 = new Product("Samsung Galaxy S21 5G", 18990000);
        Product tmp4 = new Product("Samsung Galaxy Tab S7", 18990000);
        Product tmp5 = new Product("iPad Air 4 Wifi 64GB (2020)", 16190000);
        
        product.add(tmp1);
        product.add(tmp2);
        product.add(tmp3);
        product.add(tmp4);
        product.add(tmp5);
        
        System.out.printf("%-30s%-15s%-15s\n", "Tên sản phẩm", "Giá (VNĐ)", "Thuế (VNĐ)");
        product.forEach((x) -> {
            x.outputProduct();
        });
    }
    
    public static void ex3(){
        ArrayList<Product> product = new ArrayList();
        
        Product tmp1 = new Product("iPhone 12 Pro Max 256GB", 35190000);
        Product tmp2 = new Product("Samsung Galaxy Note 20", 15990000);
        Product_NoTax tmp3 = new Product_NoTax("iPad Air 4 Wifi 64GB (2020)", 16190000);
        
        product.add(tmp1);
        product.add(tmp2);
        product.add(tmp3);
        
        System.out.printf("%-30s%-15s%-15s\n", "Tên sản phẩm", "Giá (VNĐ)", "Thuế (VNĐ)");
        product.forEach((x) -> {
            x.outputProduct();
        });
    }
    
    public static void ex4(){
        Product tmp = new Product();
        tmp.insert();
        tmp.update();
        tmp.delete();
        tmp.select();
    }
    
    public static void ex5(){
        BankingAccount account = new BankingAccount();
        int choice;
        
        do {
            Function.menuText(".     1 - Nhập thông tin", ".     2 - Xuất thông tin", ".     3 - Gửi tiền", ".     4 - Rút tiền");
            System.out.print("> Chọn chức năng: ");
            choice = Function.iInput();
            
            Function.Separate(25);
            System.out.println("");
            
            switch(choice){
                case 1:
                    Function.clear();
                    if(account.getAccName() == null)
                        account.inputAccount();
                    else
                        System.out.println("> Bạn đã tạo tài khoản!");
                    break;
                case 2:
                    Function.clear();
                    if(account.getAccName() == null)
                        System.out.println("> Bạn chưa tạo tài khoản!");
                    else
                        account.outputAccount();
                    break;
                case 3:
                    Function.clear();
                    if(account.getAccName() == null)
                        System.out.println("> Bạn chưa tạo tài khoản!");
                    else{
                        System.out.println("> Nhập số tiền cần nộp: ");
                        double depo = Function.dInput();
                        account.deposit(depo);
                    }
                    break;
                case 4:
                    Function.clear();
                    if(account.getAccName() == null)
                        System.out.println("> Bạn chưa tạo tài khoản!");
                    else{
                        System.out.println("> Nhập số tiền cần rút: ");
                        double wd = Function.dInput();
                        account.withdraw(wd);
                    }
                    break;
                case 5:
                    System.out.println("> Quay lại Menu chính!");
                    return;
                default:
                    System.out.println("> Lựa chọn không hợp lệ!");
                    break;
            }
            
        } while(true);
    }
    
    public static void menu(){
        int choice;
        
        do {
            Function.menuText(".     1 - Bài tập 1 + 2", ".     2 - Bài tập 3", ".     3 - Bài tập 4", ".     4 - Bài tập 5 (Thêm)");
            System.out.print("> Chọn chức năng: ");
            choice = Function.iInput();
            
            Function.Separate(25);
            System.out.println("");
            
            switch(choice){
                case 1:
                    Function.clear();
                    ex1_2();
                    break;
                case 2:
                    Function.clear();
                    ex3();
                    break;
                case 3:
                    Function.clear();
                    ex4();
                    break;
                case 4:
                    Function.clear();
                    ex5();
                    break;
                case 5:
                    System.out.println("Tạm biệt");
                    System.exit(0);
                default:
                    System.out.println("> Lựa chọn không hợp lệ!");
                    break;
            }
            
        } while(true);
    }
    
    public static void main(String[] args) {
       menu();
    } 
}
