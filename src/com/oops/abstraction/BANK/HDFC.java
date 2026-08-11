
package com.oops.abstraction.BANK;

public class HDFC implements bank {

    @Override
    public void deposit() {
        System.out.println("HDFC: Amount deposited");
    }

    @Override
    public void checkBalance() {
        System.out.println("HDFC: Checking balance");
    }

    @Override
    public void withdral() {
        System.out.println("HDFC: Withdrawal successful");
    }
}
