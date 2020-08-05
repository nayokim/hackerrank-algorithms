package AVeryBigSum;


public class AVeryLarge2 {
    static long aVeryBigSum(long[] ar) {
        //long  []  ar = [n,n,n,n,n]
        long sum = 0;
        for (int i = 0 ; i <=ar.length-1 ;i++){
            sum += ar[i];
        }
        return sum;

    }

    public static void main(String[] args) {

    }
}
