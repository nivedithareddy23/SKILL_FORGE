//Example For Inter Thread Communication in ATM for withdraw by two threads and to show the balance after withdraw and deposit by two threads
class Account
{
    int balance=10000;
    synchronized void withdraw(int amount)
    {
        if(balance<amount)
        {
            System.out.println("Insufficient Balance");
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        balance=balance-amount;
        System.out.println("Withdrawn Amount: "+amount);
    }
    synchronized void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println("Deposited Amount: "+amount);
        notify();
    }
}
public class InterThreadCommATM {
    public static void main(String[] args) {
        Account acc=new Account();
        Thread t1=new Thread(){
           public void run()
            {
                acc.withdraw(15000);
            }
        };
        Thread t2=new Thread(){
            public void run()
            {
                acc.withdraw(10000);
            }
        };
        t1.start();
        t2.start();
    }
    
}