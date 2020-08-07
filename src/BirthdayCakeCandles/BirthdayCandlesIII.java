package BirthdayCakeCandles;

public class BirthdayCandlesIII {
    public static void main(String[] args) {
        //why didnt it work initally:
        int [] ar = {18,90,90,13,90,75,90,8,90,43};

        int max = ar[0];
        for (int i = 0; i < ar.length; i++){
            if (max < ar[i]) {
//                ar[i] = max;
                max = ar[i];
                System.out.println(max);
            }
        }
        System.out.println(max);

        int counter =0;
        for (int j=0; j < ar.length; j++){
            if (max == ar[j]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
