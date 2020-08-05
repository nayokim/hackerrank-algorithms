package AVeryBigSum;

import java.util.Scanner;

public class ALargeSum {
    // Complete the aVeryBigSum function below.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long [] ar = new long[size];

        for (int i = 0 ; i <=ar.length - 1; i++){
            ar[i] = scanner.nextInt();
        }

        long sum = 0;
        for (int i = 0; i <= ar.length- 1; i++){
            sum += ar[i];
        }
        System.out.println(sum);
    }

}
