package bankingsystem;
import bankingsystem.BankAccounts;
class CurrentAccount extends BankAccounts{
     private static final double Overdraftlimit = 4000;

     CurrentAccount(int AccountNumber, String HolderName, double Balance){
          super( AccountNumber, HolderName, Balance,"Current");
     }
     void withdraw(double amount){
         if(amount<=Balance+Overdraftlimit){
            Balance -= Overdraftlimit;
            transactions.add(new Transaction("Withdrawal", amount));
            System.out.println("Withdrawn : "+amount);
         }else{
            System.out.println("Insufficient Funds");
         }
     }
}