package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankAccounts {
    protected int AccountNumber;
    protected  String HolderName;
    protected  double Balance;
    protected  String AccountType;
    protected  List <Transaction> transactions;
    BankAccounts(int AccountNumber, String HolderName, double Balance,String AccountType){
        this.AccountNumber = AccountNumber;
        this.HolderName = HolderName;
        this.Balance = Balance;
        this.AccountType = AccountType;
        this.transactions = new ArrayList<>();
    }
     void deposit(double amount){
        Balance += amount;
        transactions.add(new bankingsystem.Transaction("Deposit", amount));
        System.out.println("Deposited : "+amount);
     }
     void withdraw(double amount){
        if(amount<= Balance){
         Balance -= amount;
         transactions.add(new Transaction("Withdraw", amount));
         System.out.println("Withdrawed : "+amount);
        }else{
         System.out.println("Insufficient Balance");
        }
     }
     void checkBalance(){
      System.out.println("Current Balance"+Balance);
     }
     int getAccountNumber(){
      return AccountNumber;
     }
     double getBalance(){
      return Balance;
     }

     String getHolderName(){
      return HolderName;
     }
     String getAccountType(){
      return AccountType;
      
     }
     public void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History for Account " + AccountNumber + ":");
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }
}
