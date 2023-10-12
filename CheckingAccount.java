public class CheckingAccount extends BankAccount {
    double fee;

    CheckingAccount(int accno, double totalBalance) {
        super(accno, totalBalance);
    }

    void deductFee(double amount) 
    {
        if(amount == 0)
        {
            System.out.println("No charges applied.");
        }
        else if (totalBalance <= 5000) 
        {
            System.out.println("Charges applied : 8.7");
            totalBalance -= 8.7;
        } 
        else if (totalBalance <= 30000) 
        {
            System.out.println("Charges applied : 28.7");
            totalBalance -= 28.7;
        } 
        else if (totalBalance <= 50000)
         {
            System.out.println("Charges applied : 58.7");
            totalBalance -= 58.7;
        } 
        else{
            System.out.println("Charges applied : 70.6");
            totalBalance -= 70.6;
        }
    }

}
