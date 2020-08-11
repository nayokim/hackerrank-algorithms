package BreakingTheRecord;

import java.util.Arrays;

public class BreakingTheRecordI {
    public static void main(String[] args) {
        //going through the loop
        //3 4 21 36 10 28 35 5 24 42

        int [] scores = {3,4,21,36,10,28,35,5,24,42};
        int [] sortedScores =new int [2];

        // after each iteration, compare the first to the second.
        int counter = 0;
        int minCounter = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++){

            if (scores[i]>max){
                max = scores[i];
                counter++;
            }

            if (scores[i] < min){
                min = scores[i];
                minCounter++;
            }

        }
        System.out.println(counter); //  number of times she broke her best record

        System.out.println(minCounter); // number of times she broke her worst record

        sortedScores[0] = counter;
        sortedScores[1] = minCounter;











    }
}
