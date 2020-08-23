package PickingNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbersI {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int n = 6;
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        Collections.sort(a);
        int absDiff = 0;
        int counter = 0;
        int max = 0;


        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < a.size(); j++) {
                System.out.println((a.get(i) + " - "+ a.get(j)));
                absDiff = Math.abs((a.get(i) - a.get(j)));
                System.out.println("abs " + absDiff);
                if (absDiff <= 1) {
                    counter++;
                    System.out.println("counter: " + counter);
                }
            }
            if (counter > max) {
                max = counter;
                System.out.println("max: " + max);
            }
            counter = 0;
        }
        System.out.println(max);
    }
}
