package activies.encapsulation.bank.model;

public class BankCount {
    private String starter;
    private int numberOfCount;
    private double balance;

    public BankCount(String starter, int numberOfCount, double balance) {
        this.starter = starter;
        this.numberOfCount = numberOfCount;
        this.balance = balance;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public int getNumberOfCount() {
        return numberOfCount;
    }

    public void setNumberOfCount(int numberOfCount) {
        this.numberOfCount = numberOfCount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double countBalance() {
        return this.getBalance();
    }

    public void depositInCount(double value) {
        if(value > 0) {
            this.setBalance(value);
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
