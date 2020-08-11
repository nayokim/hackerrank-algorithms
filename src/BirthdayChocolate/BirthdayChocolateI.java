package BirthdayChocolate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayChocolateI {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<Integer>();
        s.add(2);
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(3);
        s.add(4);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(4);

        int d = 11;
        int m = 4;
        ////In this example, n = 10, m = 4, and d = 11; so the question is to find how many 4 ordered pieces among the 10 that their sum is equal to 11.
        //            //So, when the (i) become equal the value of 7, there will be only 3 pieces to count (7, 8, 9), which are less than 4, then regardless of their sum, they can not satisfy the rule (4 ordered pieces among the 10, their sum equal to 11)
        //            //Now, to generalize that you can say:
        //            //stop when i > n-m: (7 > 10 - 4).

        // find chocolate segments - length matches month and sum of integers matches birthday day
        // this is a really silly way to give chocolate. Just give him chocolate.

        //length = 2
        // [1,3] [2,2]


        int length = s.size();
        int count = 0;


        for (int i = 0; i < length; i++){
            int sum = 0;
            // if i +m is larger than the list's length, break loop.

            if (i + m > length) {
                break;
            }

            for (int j = i ; j < i + m ; j++){
                sum = sum +  s.get(j); // list value is added (consecutive)
            }
            System.out.println(sum);

            if (sum == d){
                count++;
            }
        }
        System.out.println(count);

    }
}
