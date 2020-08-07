package BirthdayCakeCandles;

public class BirthdayCakeCandlesI {
    public static void main(String[] args) {
        //3 2 1 3
        //find the largest number and  output the freq
        int [] arr = {3,2,1,3};

        //find the largest number in  the array
        int maxNumber = arr[0];

        // traverse the array and compare every element with current max

        for (int i = 0; i <arr.length; i++){
            if (arr[i]> maxNumber){
                maxNumber = arr[i];
            }
        }
        System.out.println(maxNumber);

        int count = 0;
        for (int i = 0; i <arr.length; i++){
            if (arr[i] == maxNumber){
                count++;
            }
        }
        System.out.println(count);

    }
}
