package DiagonalDiff;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] twoDimArray = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };
        int rows = twoDimArray.length;
        int columns = twoDimArray[0].length;

        int difference = 0;
        for (int i = 0 ; i <= rows-3; i++){
            for (int  j = 0; j <= columns-3; j++){
                int firstDiagonal = twoDimArray[i][j] + twoDimArray [i+1][j+1] + twoDimArray[i+2][j+2];
                System.out.println(firstDiagonal);
                int secondDiagonal = twoDimArray[i+2][j] + twoDimArray [i+1][j+1] + twoDimArray[i][j+2];
                System.out.println(secondDiagonal);
                difference = Math.abs(firstDiagonal - secondDiagonal);
            }
        }
        System.out.println(difference);

    }
}
