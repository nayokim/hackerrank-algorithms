package SockMerchant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SockMerchantI {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int[] socks = {10,20,20,10,10,30,50,10,20};

        for (int i = 0; i <socks.length; i++){
            System.out.println(set);
                //[] first loop is empty
                //[10] since the set is empty, add first element (10)
                //[20, 10] since there isnt a 20 in the set, add 20
                //[10] remove the 20 since it already exists
                //[] remove 10 since it already exists
                //[10] add 10 since it doesnt exist
                //[10, 30] add 30 since it doesnt exist
                //[50, 10, 30] add 50 since it doesnt exist
                //[50, 30, 20] end of loop
            int element = socks[i];
            // used to check whether a specific element is present in the HashSet or not. So basically it is used to check if a Set contains any particular element.
            if (set.contains(element)){
                set.remove(element);
                count++;
            } else{
                set.add(element);
            }
        }
        System.out.println(count);
        // count the frequency of each number
        // if that divides 2, that is == 1 pair

        /*
        The containsKey(Object key) method is used to check if this map contains a mapping for the specified key.
        // create hash map
      HashMap newmap = new HashMap();

      // populate hash map
      newmap.put(1, "tutorials");
      newmap.put(2, "point");
      newmap.put(3, "is best");

      // check existence of key 2
      System.out.println("Check if key 2 exists: " + newmap.containsKey(2));
         */

//        HashMap <Integer, Integer> h = new HashMap<Integer, Integer>();
//        int [] socks = {1,2,1,2,1,3,2};
//        for (int i = 0; i < socks.length; i++){
//            if (h.containsKey(socks[i])){
//                System.out.println(socks[i]);
////                System.out.print(" " + h.get(socks[i]) + 1);
//
//                h.put(socks[i], h.get(socks[i]) + 1);
//            } else {
//                h.put(socks[i], 1);
//            }
//        }
//        System.out.println(h);
    }
}
