import java.util.Scanner;
public class SavingAccount extends BankAccount
{

    double interestRate;

    SavingAccount(int accno, double totalBalance) {
        super(accno, totalBalance);
    }


    void addInterest(Scanner sc)
    {
        System.out.print("Enter interestRate in % :");
        interestRate = sc.nextDouble();

        System.out.print("Enter the TimePeriod in months :");
        int time = sc.nextInt();

        totalBalance += (totalBalance * (interestRate / 100) * time);
    }

}