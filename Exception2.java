public class Exception2{
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        try{
        ca.withdraw(115);
        }catch(InsufficientFundException e){
            System.out.println(e.getMessage());
        }
    }
}