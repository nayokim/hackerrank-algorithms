package DrawingBook;

import java.util.Scanner;

public class DrawingBookI {
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        //n = 8 pages, page p = 4 - how many turns?
        // start = 1
        int turnsFromFirstPage = n/2;
        int turnsFromTarget= p/2;
        int turnsFromLastPage = turnsFromFirstPage - turnsFromTarget;

        return Math.min(turnsFromTarget, turnsFromLastPage);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int result = pageCount(n, p);
        System.out.println(result);
    }

}
