package ElectronicsShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicsShopI {
    public static void main(String[] args) {
        int [] keyboards = {3,1};
        int [] drives ={5,2,8};
        List<Integer> cost = new ArrayList<>();
        int b = 10;
        int sum = 0;

        for (int i = 0; i < keyboards.length; i++){
            for (int j = 0; j < drives.length; j++){
                sum = keyboards[i] + drives[j];
                cost.add(sum);
            }
        }
      int max = 0;
        for (int i =0; i < cost.size(); i++){
           if (cost.get(i) <= b){
              max = cost.get(i);
           }
        }
        System.out.println(max);


    }
}
