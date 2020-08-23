package PickingNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbersII {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int n = a.size();
        Collections.sort(a);
        int absDiff = 0;
        int counter = 0;
        int max = 0;
        for (int i = 0; i < a.size(); i++){
            for (int j = i; j < a.size();j++){
                absDiff = Math.abs(a.get(i) - a.get(j));
                if (absDiff <= 1){
                    counter++;
                }
            }
            if (counter > max){
                max = counter;
            }
            counter = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        Collections.sort(a);
        System.out.println(pickingNumbers(a));
    }
}
