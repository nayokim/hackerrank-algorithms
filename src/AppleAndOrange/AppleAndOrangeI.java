package AppleAndOrange;

public class AppleAndOrangeI {
    public static void main(String[] args) {
        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        int[] apples = {2, 3, -4};
        int[] oranges = {3, -2, -4};

//        Given the value of d for m  apples and  n oranges, determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range )?
        int appleCount = 0;
        int orangeCount = 0;


        for (int i = 0; i < apples.length; i++) {
            if (apples[i] >= s && apples[i] <= t) {
                appleCount++;
            }
        }

        for (int j = 0; j < oranges.length; j++) {
            if (oranges[j] >= s && oranges[j] <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount + "\n" + orangeCount);
    }
}
