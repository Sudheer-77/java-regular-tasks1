package com.oops.abstraction.BANK;

public class SBI implements bank {

    @Override
    public void deposit() {
        System.out.println("SBI: Amount deposited");
    }

    @Override
    public void checkBalance() {
        System.out.println("SBI: Checking balance");
    }

    @Override
    public void withdral() {
        System.out.println("SBI: Withdrawal successful");
    }
}