package CountingValleys;

public class CountingVallyesI {
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
