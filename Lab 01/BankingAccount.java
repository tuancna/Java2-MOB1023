package com.poly;

public class BankingAccount {
    private String accId;
    private String accName;
    private double accBalance;

    public BankingAccount() {}

    public BankingAccount(String accId, String accName, int accBalance) {
        this.accId = accId;
        this.accName = accName;
        this.accBalance = accBalance;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
    
    public void inputAccount(){

        System.out.print("> Nhập mã tài khoản: ");
        this.setAccId(Function.sInput());
        
        System.out.print("> Nhập tên khách hàng: ");
        this.setAccName(Function.sInput());
        
        this.setAccBalance(0);
    }
    
    public void outputAccount(){
        if(this.getAccId() == null){
            System.out.println("> Chưa có thông tin!");
        } else{
            System.out.printf("%-20s%-30s%-20s", "Mã tài khoản", "Họ và tên", "Số dư");
            System.out.printf("%-20s%-30s%-20s", this.getAccId(), this.getAccName(), String.format("%,.1f",this.getAccBalance()));
        }
    }
    
    public void withdraw(double value){
        if(value > this.getAccBalance()){
                System.out.println("> Số dư không đủ!");
            } else{
                this.setAccBalance(this.getAccBalance() - value);
                System.out.println("> Rút tiền thành công!");
                System.out.println("> Số dư còn lại: " + String.format("%,.1f", this.getAccBalance()) + " VNĐ");
            }
    }
    
    public void deposit(double value){
        this.setAccBalance(this.getAccBalance() + value);
        System.out.println("> Nộp tiền thành công!");
        System.out.println("> Số dư mới: " + String.format("%,.1f", this.getAccBalance()) + " VNĐ");
    }
}
