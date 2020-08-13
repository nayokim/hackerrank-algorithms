package MigratoryBirds;

import java.util.List;

public class MigratoryBirdsIII {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        int [] varietyOfBirds = new int [6];

        for (int n:arr){
            varietyOfBirds[n]++;
        }

        int frequency = 0;
        int birdType = 0;

        for (int i = 0; i < varietyOfBirds.length; i++) {
            if (varietyOfBirds[i] > frequency) {
                frequency = varietyOfBirds[i];
                birdType = i;
            }
        }
        return birdType;





    }

    public static void main(String[] args) {

    }

}
