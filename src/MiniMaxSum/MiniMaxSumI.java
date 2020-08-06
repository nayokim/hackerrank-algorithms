package MiniMaxSum;
//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
public class MiniMaxSumI {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        long min = 0;
        long max = 0;
        long sum = 0;

        min = arr[0];
        max = min;
        sum = min;

        for (int i = 1; i <arr.length; i++){
            sum += arr[i];
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println((sum-max) + " " + (sum-min));


    }
}
