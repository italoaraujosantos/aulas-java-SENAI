package activies.encapsulation.bank.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BankCount {
    private String starter;
    private int numberOfCount;
    private double balance;

    private static final Random random = new Random();
    private static final Set<Integer> genereteCounts = new HashSet<>();

    public BankCount(String starter) {
        this.starter = starter;
        this.numberOfCount = generateNumberOfCount();
        this.balance = balance;
    }

    public String getStarter() {
        return starter;
    }

    @Override
    public String toString() {
        return "BankCount{" +
                "starter='" + starter + '\'' +
                ", numberOfCount=" + numberOfCount +
                ", balance=" + balance +
                "}\n";
    }

    private int generateNumberOfCount() {
        int number;

        do {
            number = 100000 + random.nextInt(900000);
        } while (genereteCounts.contains(number));

        genereteCounts.add(number);
        return number;
    }

    public void depositInCount(double value) {
        if(value > 0) {
            this.balance = value;
        } else {
            throw new IllegalArgumentException("Valor de deposito deve ser maior que zero!");
        }
    }

    public void withdrawalInCount(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }

        if (this.balance >= value) {
            this.balance -= value;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

}
