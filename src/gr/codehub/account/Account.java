package gr.codehub.account;

public class Account {

    private String owner;
    private double balance;
    private int numberOfTransactions;

    public Account(String owner) {
        this.owner = owner;
        this.balance = 0.0;
        numberOfTransactions = 0;
    }

    public void withdraw(double amount) {
        if(balance>=amount) {
            balance -= amount;
            numberOfTransactions++;
            System.out.println("New balance is " + balance);
        } else{
            System.out.println("Not enough balance. Try a different amount");
        }
    }
    public void deposit(double amount){
        balance +=amount;
        numberOfTransactions++;
        System.out.println("New balance is "+ balance);
    }

    public void showAccount() {
        System.out.println("Account:" +
                "owner=" + owner +
                ", balance=" + balance +
                ", numberOfTransactions=" + numberOfTransactions);
    }
}
