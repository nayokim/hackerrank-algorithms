package DivisibleSumPairs;

public class DivisibleSumPairsII {
    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] ar = {1,3,2,6,1,2};
        int k = 3;
        int n =6;

        System.out.println(divisibleSumPairs(n,k,ar));
    }
}
