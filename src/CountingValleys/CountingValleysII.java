package CountingValleys;

public class CountingValleysII {
    static int countingValleys(int n, String s) {

        //8
        //UDDDUDUU

        //output : 1
        // logic : everytime you go up, counter ++, everytime you go down, counter--/ return counter?

        int valley = 0;
        int steps = 0;
        char[] stringToArray = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (stringToArray[i] == 'D') {
                steps--;
            } else {
                steps++;
                if (steps == 0) {
                    valley++;
                }
            }
        }
        return valley;
    }
        public static void main (String[]args){
        int n = 12;
        String s = "DDUUDDUDUUUD";
        //
            System.out.println(countingValleys(n,s));
        }
    }
