package CompareTheTriplets;

import java.util.Arrays;
import java.util.List;

public class TriplePoints2 {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int A = 0;
        int B = 0;

        for (int i = 0 ; i < a.size(); i++){
            if (a.get(i) > b.get(i)){
                A++;
            } else {
                B++;
            }
        }
        return Arrays.asList(A,B);
    }

    public static void main(String[] args) {

    }
}
