package DivisibleSumPairs;


public class DivisibleSumPairsI {


    public static void main(String[] args) {

        // given an array, find and print (i,j) pairs where  :
        // i < j
        //ar[i] + ar[j] % k = 0

        int [] ar = {1,3,2,6,1,2};
        int k = 3;
        int n = 6;
        int  count = 0;


        for  (int i = 0; i< ar.length; i++){
//            System.out.println("inside first loop " + ar[i]);
            for (int  j= i + 1; j < n; j++){
                /*
                inside the nested loop, ar[i] (element position value) gets looped through each time with the value of ar[j].
                1 + 3 = 4 x fails
                1 + 2 = 3
                1 + 6 = 7 x fails
                1 + 1 = 2 x fails
                1 + 2  = 3
                ===
                3 + 2 x fails
                3 + 6  = 9
                3 + 1 x fails
                3 + 2 x fails
                ===
                2 + 6 x fails
                2 + 1 = 3
                2 + 2 x fails
                ===
                i < j x fails
                6 + 1 = 7 x fails
                6 + 2 = 8 x fails
                ===
                1 + 2 = 3

                 */
                System.out.println("ar[i] = " + ar[i] + " ar[j] = " +  ar[j] );
                System.out.println((ar[i] + ar[j]) % k == 0);
                if ((ar[i] + ar[j]) % k== 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
