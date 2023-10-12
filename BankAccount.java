import java.util.Scanner;

public class BankAccount {
    int accno;
    double totalBalance;

    BankAccount(int accno, double totalBalance) {
        this.accno = accno;
        this.totalBalance = totalBalance;
    }

    void deposit(Scanner sc) {
        System.out.print("How much amount You want to deposit :");
        totalBalance += sc.nextDouble();
    }

    double withdraw(Scanner sc) {
        System.out.print("How much amount You want to Withdraw :");
        double amount = sc.nextDouble();
        if (amount > totalBalance) {
            System.out.println("Insufficient Balance...");
            return 0;
        } else {
            totalBalance -= amount;
            System.out.println("Withdraw Successfully");
            return amount;
        }
    }

    void getBalance() {
        System.out.println("Current Balance :" + totalBalance);
    }
}