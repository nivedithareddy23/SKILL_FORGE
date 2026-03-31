//simple exmaple of callable with future
import java.util.concurrent.*;
public class CallablewithFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor=Executors.newSingleThreadExecutor();
        Future<Integer> future=executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for(int i=1;i<=10;i++)
                {
                    sum+=i;
                }
                return sum;
            }
        });
        System.out.println("Calculating sum...");
        int result=future.get();
        System.out.println("Sum of first 10 natural numbers: "+result);
        executor.shutdown();
    }
}