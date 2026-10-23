package mypersonal_bank;
import java.util.*;

public class BOI implements Bank{

    Map<String,Integer> accounts=new HashMap<>();

    int rate_of_interest=7;

    @Override
    public void openAccount(String accountName,int amount){
        accounts.put(accountName,amount);
    }

    @Override
    public int getRate_of_interest(){
        return rate_of_interest;
    }

    @Override
    public int depositAmount(String accountName,int amount){
        int balance=accounts.get(accountName);
        balance+=amount;
        accounts.put(accountName,balance);
        return balance;

    }
    @Override
    public int withdraw(String accountName,int amount){
        int balance=accounts.get(accountName);
        balance-=amount;
        accounts.put(accountName,balance);
        return balance;
    }
    @Override
    public int checkBalance(String accountName){
        return accounts.get(accountName);
    }

    @Override
    public void showAccountDetails(String accountName){
        System.out.println("the name of account is "+accountName);
        System.out.println("the current balance is "+accounts.get(accountName));

    }


 }
