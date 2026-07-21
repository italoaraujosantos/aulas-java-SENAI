package activies.encapsulation.bank.main;

import activies.encapsulation.bank.model.BankCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankCount count1 = new BankCount("Italo Araujo");
        BankCount count2 = new BankCount("Maria Joaquina");

        count1.depositInCount(5265.99);

        count2.depositInCount(9565.00);
        System.out.println(count1);
        System.out.println(count2);

        count1.withdrawalInCount(500);
        count2.withdrawalInCount(1560);
        System.out.println(count1);
        System.out.println(count2);
    }

}
