package ElectronicsShop;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShopII {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        List<Integer> cost = new ArrayList<>();
        int sumCost = 0;
        for (int i = 0; i < keyboards.length; i++){
            for (int j = 0; j < drives.length; j++){
                sumCost = keyboards[i] + drives[j];
                cost.add(sumCost);
            }
        }

        int maxPrice = 0;
        for (int i = 0; i < cost.size(); i++){
            if (cost.get(i) <= b){
                maxPrice = cost.get(i);
            } else {
                maxPrice = -1;
            }
        }
        return maxPrice;

    }

    public static void main(String[] args) {
        int [] keyboards = {3,1};
        int [] drives ={5,2,8};
        int b = 10;

        System.out.println(getMoneySpent(keyboards,drives,b));
    }
}
