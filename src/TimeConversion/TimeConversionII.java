package TimeConversion;

import java.util.Scanner;

public class TimeConversionII {
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] hourMinSec = s.split(":");
        int hour = Integer.parseInt(hourMinSec[0]);
        String min = String.valueOf(hourMinSec[1]);
        String sec = String.valueOf(hourMinSec[2]);
        String checkAMPM = sec.substring(0, sec.length() - 2);

        if (sec.contains("AM") && hour < 12) {
            return ("0" + hour + ":" + min + ":" + checkAMPM);
        } else if (sec.contains("AM") && hour == 12) {
            String zeroHour = "00";
            return (zeroHour + ":" + min + ":" + checkAMPM);
        } else if (sec.contains("PM") && hour < 12) {
            return ((hour + 12)+ ":" + min + ":" + checkAMPM);
        } else if (sec.contains("PM") && hour ==12){
            return("12" +":" + min + ":" + checkAMPM );
        } else {
            return ((hour - 12) + ":" + min + ":" + checkAMPM);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = timeConversion(s);

        System.out.println(result);

    }
}
