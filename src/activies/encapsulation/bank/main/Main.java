package activies.encapsulation.bank.main;

import activies.encapsulation.bank.model.BankCount;

public class Main {
    public static void main(String[] args) {
        BankCount count1 = new BankCount("Italo Araujo", 35965-5, 0.0);
        count1.depositInCount(150.00);
        count1.withdrawalInCount(100);
        count1.depositInCount(107566.00);

        count1.countBalance();
    }



}
