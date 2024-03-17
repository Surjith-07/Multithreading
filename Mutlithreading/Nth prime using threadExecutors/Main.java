import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        long arr[]={2,4,5,6,7,8,10};
//        int k=7;
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        while(sc.hasNext()) executorService.execute(new Finder(sc.nextLong()));
    }
}

class Finder implements Runnable{
    long n;
    static PrimeFinder obj=new PrimeFinder();
    Finder(long n){
        this.n=n;
    }

    @Override
    public void run() {

        System.out.println(n+"----------------"+ obj.getPrime(n));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
