package MigratoryBirds;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirdsII {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(2);


        int[] typesOfBirds = new int[6];
//        for (int n: arr){
//            typesOfBirds[n]++;
//            System.out.println(typesOfBirds[n]++);
//        }

        for (int i = 0; i < arr.size(); i++) {
            typesOfBirds[arr.get(i)]++;
//            System.out.println(typesOfBirds[arr.get(i)]++);
        }

//        for (int i = 0 ; i < typesOfBirds.length; i++){
//            System.out.println(typesOfBirds[i]);
//        }

        int high = 0; //frequency
        int highBirdNum = 0; // the type of bird
        //loop through the typesofBirds array
        for (int i = 0; i < typesOfBirds.length; i++) {
            if (typesOfBirds[i] > high) {
                high = typesOfBirds[i];
                highBirdNum = i;
            }
        }
        System.out.println(highBirdNum);

    }
}
