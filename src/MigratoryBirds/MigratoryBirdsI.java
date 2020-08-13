package MigratoryBirds;

import java.util.ArrayList;
import java.util.List;

//with notes
public class MigratoryBirdsI {
    //find the highest frequency of bird and print the max number
    //constraint: there are only 5 types of birds
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


//        for (int num : arr){
//            System.out.print(num + " ");
//        }
//
        int [] varietyOfBirds = new int [6];// bird numbers are guaranteed to be between [1,5], we ignore index 0.


        //In the first loop we are simply going through the list of ints we are given and putting them into the array we made based on the index.
        // If the bird is "4", we put it into index 4. So let's say we have this input: 1 1 2 1 3 4 4 5 2 We are going to get each number from this list and put it into the array based on index.
        for  (int n : arr){
         varietyOfBirds[n]++;
        }

        // So our array would look like this: [0, 3, 2, 1, 2, 1] We have 0 birds of number 0(since that's not valid), 3 birds of number 1, 2 birds of number 2, 1 bird of number 3, 2 birds of number 4, and 1 bird of number 5. The correct answer in this case would be 1, since that is the bird with the highest number.
//        for (int bird : varietyOfBirds){
//            System.out.print(bird + " "); //0 3 2 1 2 1
//        }


        int high = 0;//frequency
        int highBirdNum =  0;// the type of bird
        //loop through the typesofBirds array
        for (int i = 0; i < varietyOfBirds.length; i++){
            //System.out.println(typesOfBirds[i]);
            //System.out.println(i);

            if (varietyOfBirds[i] > high){
                high = varietyOfBirds[i];
                System.out.println(high); // highest frequency
                System.out.println(i); // type of bird
                highBirdNum =i;
            }
        }
        System.out.println(highBirdNum);

        // Essentially, index = bird number, which index is highest, if there are multiple indexes with the same number, lowest index wins

    }
}
