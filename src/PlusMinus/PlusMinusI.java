package PlusMinus;

import java.util.Scanner;

public class PlusMinusI {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, -1, -1};
//        for (int num : arr){
//            System.out.println(num);
//        }

        //Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.Print the decimal value of each fraction on a new line with 6 places after the decimal.
        double pos = 0;
        double neg = 0;
        double zero = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 0){
                System.out.println("zero: " + arr[i]);
                zero++;
            } else if (arr[i] > 0) {
                System.out.println("pos: " + arr[i]);
                pos++;
            } else if (arr[i] < 0) {
                System.out.println("neg: " + arr[i]);
                neg++;
            }
        }
        System.out.println(arr.length);
        System.out.println(zero/arr.length);
        System.out.println(pos/arr.length);
        System.out.println(neg / arr.length);
    }
}
