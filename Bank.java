package bankingsystem;
import java.util.ArrayList;
import bankingsystem.BankAccounts;

public class Bank {
    private ArrayList<BankAccounts> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }
    public void addAccount(BankAccounts account) {
       
        if (findAccount(account.getAccountNumber()) != null) {
            System.out.println("⚠ Account with number " + account.getAccountNumber() + " already exists!");
        } else {
            accounts.add(account);
            System.out.println(" Account created: " + account.getAccountNumber());
        }
    }
    public BankAccounts findAccount(int accountNumber) {
        for (BankAccounts acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null; 
    }

    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        for (BankAccounts acc : accounts) {
            System.out.println("Acc No: " + acc.getAccountNumber() +
                               " | Holder: " + acc.getHolderName() +
                               " | Balance: " + acc.getBalance() +
                               " | Type: " + acc.getAccountType());
        }
    }
}
