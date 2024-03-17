public class PrimeFinder {

    public long getPrime(long n){
        long idx=2L;
        while(n>0){
            if(isPrime(idx)) --n;
            ++idx;
        }
        return idx-1;
    }

    public boolean isPrime(long n){
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i==0) return false;
        }
        return true;
    }
}
