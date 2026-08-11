package com.oops.abstraction.BANK;

public class BankMain {

    public static void main(String[] args) {

        bank b = new SBI();

        b.deposit();
        b.checkBalance();
        b.withdral();
        
        b.mainbrach();
        bank.currency();
       
        System.out.println("**********************************************");
        bank a= new AXIS();
        
        a.checkBalance();
        a.deposit();
        a.withdral();
        
        a.mainbrach();
        bank.currency();
        System.out.println("**********************************************");
        bank H = new HDFC();
        H.checkBalance();
        H.deposit();
        H.withdral();
        
        H.mainbrach();
        bank.currency();
        
    }
}