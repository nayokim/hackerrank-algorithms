package SockMerchant;

import java.util.Arrays;

public class SockMerchantII {

    public static void main(String[] args) {
        int[] socks = {10,20,20,10,10,30,50,10,20};

        int counter = 0;
        int count = 0;
        for (int i = 0; i < socks.length; i++){
            count = 1;
            for (int j = i + 1; j < socks.length; j++){
                if (socks[i] == socks[j]){
                    count++;
                }
            }
            if (count % 2 == 0){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
