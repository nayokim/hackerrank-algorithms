package TimeConversion;

public class TimeConversionI {
    public static void main(String[] args) {
        //  convert time from 12-hour format to 24hr military time
        // 12 hr -> military : + 12 Hours
        // if PM is included, you need to get rid of PM
        //remove last two characters from string

        String time = "07:05:45PM";
        String[] hourMinSec = time.split(":");
        int hour = Integer.parseInt(hourMinSec[0]);
        String min = String.valueOf(hourMinSec[1]);
        String sec = String.valueOf(hourMinSec[2]);
//        for (String p : hourMinSec) {
//            System.out.println(p);
//        }
        int hourPlusTwelve = hour + 12;

        if (sec.contains("PM")) {
            String removePM = sec.substring(0, sec.length() - 2);
            System.out.println(hourPlusTwelve + ":" + min + ":" + removePM);
        } else{
            System.out.println(hourPlusTwelve + ":" + min + ":" + sec);
        }
    }
}

//        if (!time.contains("PM")){
//            String [] hourMinSec = time.split(":");
//            int hour = Integer.parseInt(hourMinSec[0]);
//            String min = String.valueOf(hourMinSec[1]);
//            String sec = String.valueOf(hourMinSec[2]);
//
//            int newHour = hour + 12;
//            System.out.println(newHour);
//
//            System.out.println(newHour + ":" + min + ":" + sec);
//        }
//        if (time.contains("PM")) {
//            String removePM = time.substring(0,time.length()-2);
//
//
//            int newHour = hour + 12;
//            System.out.println(newHour);
//
//            System.out.println(newHour + ":" + min + ":" + sec);
//        }









