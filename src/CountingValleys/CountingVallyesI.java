package CountingValleys;

public class CountingVallyesI {
    static int countingValleys(int n, String s) {

        //8
        //UDDDUDUU

        //output : 1
        // logic : everytime you go up, counter ++, everytime you go down, counter--/ return counter?

        int counter = 0;
        char [] stringToArray = s.toCharArray();
        for (char ch:stringToArray){
            System.out.println(ch);
        }



return 0;


    }
    public static void main(String[] args) {
        int valley = 0;
        int steps = 0;
        String s = "UDDDUDUU";
        int n = 8;
        char[] stringToArray = s.toCharArray();

        for (int i = 0; i <n; i++){

            if (stringToArray[i]=='D'){
               steps--;
            } else {
                steps++;
                if (steps == 0){
                    valley++;
                }
            }

        }
        System.out.println(valley);

    }

}
