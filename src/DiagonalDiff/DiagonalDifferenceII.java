package DiagonalDiff;

import java.util.List;

public class DiagonalDifferenceII {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int rows = arr.size();
        int columns = arr.get(0).size();

        int difference = 0;
        for (int i = 0 ; i <= rows-3; i++){
            for (int  j = 0; j <= columns-3; j++){
                int firstDiagonal = arr.get(i).get(j) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j+2);
                int secondDiagonal = arr.get(i+2).get(j) + arr.get(i+1).get(j+1) + arr.get(i).get(j+2);
                difference = Math.abs(firstDiagonal - secondDiagonal);
            }
        }
        return (difference);

    }

}
