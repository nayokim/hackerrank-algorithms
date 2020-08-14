package BonAppetit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetitII {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int i = 0; i < bill.size(); i++) {
            total += bill.get(i);
        }
        int splitEvenly = total / 2;
        int annaResponsibility = (total - bill.get(k)) / 2;

        if (b == annaResponsibility) {
            System.out.println("Bon Appetit");
        } else {
            int refund = b - annaResponsibility;
            System.out.println(refund);
        }
    }

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<Integer>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int k =1;
        int b= 7;

        bonAppetit(bill,k,b);


    }
}
