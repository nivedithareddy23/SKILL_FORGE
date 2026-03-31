class Counter
{
    int count=0;
    void increment()
    {
        count++;
        System.out.println(count);
    }
}
public class ThreadEx
{
    public static void main(String[] args)throws InterruptedException
    {
        Counter c=new Counter();
        Thread t1=new Thread(){
            public void run()
            {
                for(int i=0;i<1000;i++)
                 c.increment();
            }
        };
         Thread t2=new Thread(){
            public void run()
            {
                for(int i=0;i<1000;i++)
                 c.increment();
            }
        };
        t1.start();
        t2.start();
    }
}