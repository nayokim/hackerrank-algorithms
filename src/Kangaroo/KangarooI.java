package Kangaroo;

import java.util.Scanner;

public class KangarooI {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean catchUp  = (v2 < v1);
        String response = "NO";

        if (catchUp){
            boolean Intersect = (x1 - x2) % (v2 - v1) == 0;
            if (Intersect){
                response = "YES";
            }
        }
        return response;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] x1V1X2V2 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);

        //Kangaroo position  = (no. of jumps * distance per jump) + starting position
        //k = yv + x
        //(y * v1) + x1 = (y * v2) + x2
        // (x1 - x2) / (v2 - v1) = y
       // (x1 - x2) % (v2 - v1) == 0







    }
}
