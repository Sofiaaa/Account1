package gr.codehub.account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Zouganeli");
        account.withdraw(60.00);
        account.showAccount();
        account.deposit(50.00);
        account.showAccount();
        account.withdraw(30.00);
        account.showAccount();
        account.deposit(150.00);
        account.showAccount();

        StoreAccount storeAccount = new StoreAccount("Petridis","The Bakery",AccountCategory.MID);
        storeAccount.showAccount();
        storeAccount.deposit(2000.0);
        storeAccount.showAccount();
        storeAccount.changeCategory(AccountCategory.PREMIUM);
        storeAccount.showAccount();
    }

}
