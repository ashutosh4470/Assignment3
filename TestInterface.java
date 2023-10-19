import java.util.Scanner;

interface CreditCard {
    public void Ruppes();

    public void Dollars();

    public void Pounds();
}

class BankAccount implements CreditCard {
    Scanner sc = new Scanner(System.in);

    // int rupees = 500;
    public void Ruppes() {
        System.out.println();
        System.out.print("Enter Amount in Ruppes :");
        float amt = sc.nextFloat();
        System.out.printf("\nPayment made successfully :Rs.%,.2f", amt);
    }

    public void Dollars() {
        System.out.println();
        System.out.print("Enter Amount in Dollars :");
        float amt = sc.nextFloat();
        System.out.printf("Payment made successfully :Dollars. %,.2f ", (amt / 83));
    }

    public void Pounds() {
        System.out.println();
        System.out.print("Enter Amount in pounds :");
        float amt = sc.nextFloat();
        System.out.printf("\nPayment made successfully :Pounds %,.2f ", amt / 40);
    }
}

public class TestInterface {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        System.out.println("You have to Pay 500.Rs");
        bk.Ruppes();
        bk.Dollars();
        bk.Pounds();
    }
}
