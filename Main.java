package  bankingsystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Show Transaction History");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accnum = sc.nextInt();
                     sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String name  = sc.nextLine();
                    System.out.print("Enter intial Balance: ");
                    double balance = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter account type (savings/current):");
                    String type = sc.nextLine();
                    if (type.equalsIgnoreCase("savings")) {
                        bank.addAccount(new SavingsAccount(accnum, name, balance));
                    } else if (type.equalsIgnoreCase("current")) {
                        bank.addAccount(new CurrentAccount(accnum, name, balance));
                    } else {
                        System.out.println(" Invalid account type!");
                    }
                    break;
                    case 2:
                        System.out.print("Enter account number: ");
                         accnum = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter deposit amount : ");
                        double depamnt = sc.nextDouble();
                        sc.nextLine();
                        BankAccounts b1 = bank.findAccount(accnum);
                        if(b1 != null){
                            b1.deposit(depamnt);
                        }else{
                           System.out.println("Account not found");
                        }
                        break;
                        case 3:
                            System.out.print("Enter the AccountNumber: ");
                             accnum = sc.nextInt();
                            System.out.print("Enter Withdraw amount: ");
                            double withamnt = sc.nextDouble();
                            sc.nextLine();
                          BankAccounts b2 = bank.findAccount(accnum);
                            if(b2!= null){
                               b2.withdraw(withamnt);
                            }else{
                                System.out.print("Account not found");
                            }
                            break;
                            case 4:
                                System.out.print("Enter the account number: ");
                                accnum = sc.nextInt();
                                BankAccounts b3 = bank.findAccount(accnum);
                                if(b3!=null){
                                    System.out.print("Balance: "+b3.getBalance());

                                }else{
                                    System.out.print("Account not found");
                                }
                                break;
                                case 5:
                                    System.out.print("Enter AccountNumber: ");
                                    accnum  = sc.nextInt();
                                    BankAccounts b4 = bank.findAccount(accnum);
                                    if(bank.findAccount(accnum)!= null){
                                        b4.showTransactionHistory();

                                 }else{
                                    System.out.print("Account Not Found");
                                 }
                                 break;
                                 case 6:
                                 System.out.print("Accounts in the bank");
                                 bank.showAllAccounts();
                                 break;
                                 case 7:
                                    System.out.print(" Thank you for using the bank system!");
                    sc.close();
                    return;
                    default:
                        System.out.print("Invalid choice try again");
            }
        }
    }
}
