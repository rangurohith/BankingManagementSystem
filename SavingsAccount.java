package bankingsystem;
import bankingsystem.BankAccounts;

class SavingsAccount extends BankAccounts{
     private static final double INTEREST_RATE = 4.5;

     SavingsAccount(int AccountNumber, String HolderName, double Balance){
          super(AccountNumber, HolderName, Balance,"Savings");
     }
     void SavingInterest(){
          double interest = (Balance*INTEREST_RATE)/100;
          deposit(interest);
          System.out.println("Balance after interest rate: "+ Balance);
     }
}