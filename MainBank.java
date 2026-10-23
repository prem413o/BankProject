package mypersonal_bank;

public class MainBank {
    public static void main(String args[]){
        Bank bank=new BOI();
        bank.openAccount("Suraj_kumar",2000);

        bank.showAccountDetails("Suraj_kumar");
        bank.depositAmount("Suraj_kumar",3000);
        bank.showAccountDetails("Suraj_kumar");

        bank.withdraw("Suraj_kumar",350);
        System.out.println("the Available balance is "+bank.checkBalance("Suraj_kumar"));
    }

}
