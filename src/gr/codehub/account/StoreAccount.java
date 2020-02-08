package gr.codehub.account;

public class StoreAccount extends Account{
    private String storeName;
    private AccountCategory accountCategory;

    public StoreAccount(String owner, String storeName, AccountCategory accountCategory) {
        super(owner);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(AccountCategory accountCategory){
        this.accountCategory = accountCategory;
    }

    @Override
    public void showAccount() {
        super.showAccount();
        System.out.println("storeName=" + storeName +
                ", accountCategory=" + accountCategory);
    }
}
