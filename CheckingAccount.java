class CheckingAccount{
    int balance = 100;

    public void withdraw(int amt)throws InsufficientFundException
    {
        if(amt < balance){
            balance -= amt;
            System.out.println("Withdraw Successfull..\tBalance:"+balance);
        }else{
            throw new InsufficientFundException("Insuffiecient Funds    Current Balance is:"+balance);
        }
    }
}