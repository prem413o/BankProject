package mypersonal_bank;

public interface Bank {
    public void openAccount(String accountName,int amount);

    public int getRate_of_interest();

    public int depositAmount(String accountName,int amount);

    public int withdraw(String accountName,int amount);

    public void showAccountDetails(String accountName);

    public int checkBalance(String accountName);
}
