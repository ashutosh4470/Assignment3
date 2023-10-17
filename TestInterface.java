 interface CreditCard 
{
    public void Ruppes();
    public void Dollars();
    public void Pounds();
}
class BankAccount implements CreditCard
{
    public void Ruppes()
    {
        System.out.println("Rupees");
    }
    public void Dollars()
    {
        System.out.println("Dollars");
    }
    public void Pounds()
    {
        System.out.println("Pounds");
    }
    }


public class TestInterface {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        bk.Ruppes();
        bk.Dollars();
        bk.Pounds();
    }
}

