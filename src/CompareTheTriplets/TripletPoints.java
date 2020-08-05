package CompareTheTriplets;

public class TripletPoints {
    public static void main(String[] args) {


        //given 2 arrays, compare each index. the higher number gets a point.
        //output : the points between the two arrays
        int[] alice = new int[3];
        alice[0] = 10;
        alice[1] = 20;
        alice[2] = 30;

        int[] bob = new int[3];
        bob[0] = 1;
        bob[1] = 1;
        bob[2] = 1;

        int [] points = new int[2];
        points[0] = 0;
        points[1] = 0;

        for (int j = 0; j <= bob.length - 1; j++) {
            System.out.println("bob " + bob[j]);
            System.out.println("alice" + alice[j]);
            if (bob[j] > alice[j]){
                ++points[0];
            } else {
                ++points[1];
            }
        }
        for (int point :points){
            System.out.println("point" + point);
        }
    }
}
