package object_intro2;

import java.util.Scanner;
public class BankAccountApp {
    public static void main (String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("1001",500);

        Scanner input = new Scanner (System.in);
        double amount;
        int choice;
        do {
           System.out.print("Deposit (1), Withdrawal (2), Update (3), or Exit (0): ");
           choice = Integer.parseInt(input.nextLine());
           if (choice == 0) {
              break;
           } else if (choice == 1) {
              System.out.print("Enter your deposit amount: ");
              amount = Double.parseDouble(input.nextLine());
              account2.deposit(amount);
              System.out.println(account2.toString());
           } else if (choice == 2){
              System.out.print("Enter your withdrawal amount: ");
              amount = Double.parseDouble(input.nextLine());
              account2.withdrawal(amount);
              System.out.println(account2.toString());
           }  else {
              System.out.print("Enter your update amount: ");
              amount = Double.parseDouble(input.nextLine());
              account2.setBalance(amount);
              System.out.println(account2.toString());
          }
        } while (choice != 0);
    }
}
