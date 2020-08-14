package DayOfProgrammer;

import java.util.Scanner;

public class DayOfProgrammerII {
//    static String dayOfProgrammer(int year) {
    // in 1918 : jan  31 - > (next day) = feb 14
        /*
        29  days during a leap years
        28 days during all other years
        1700 - 1917 : julian calendar, leap jear is divisible by 4
        1919 - present gregorian calendar, leap year is divisible by :
            - 400 OR
            - divisble by 4 but not 100;

        Q; find the 256th day of the  year according to the russian calendar during that year and print dd.mm.yyyy format.

        ex: given year 1984,
        - divisible by 4 (so it is a leapyear)
        - 256th day of the leapyear after 1918 is sept 12 so answer is 12.09.1984.
         */
//
//        1700 - 1917 : julian calendar, leap jear is divisible by 4
//        1919 - present gregorian calendar, leap year is divisible by :
//        - 400 OR
//                - divisble by 4 but not 100;


    // year < 1918 : Julian calendar
    // leap jear is divisible by 4

    // year > 1918
    // 1. divisible by 400 OR 2. divisible by 4 but NOT 100
    // 365 days in a year
    // 366 days in a leap year
    // 1917 , 351 days
//        int day256 = 256;
//        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        // 1.  find if the year is a leap year
//        if (year <= 1917) {
//            if (year % 4 == 0) {
//                daysInMonths[1] = 29;
//            } else {
//                daysInMonths[1] = 28;
//            }
//        } else if (year == 1918) {
//            daysInMonths[1] = 15;
//        } else {
//            if (year % 400 == 0 || year % 100 != 0) {
//                daysInMonths[1] = 29;
//            } else {
//                daysInMonths[1] = 28;
//            }
//        }
//
//
//        int sumOfDays = 0;
//        int monthCount = 0;
//
//        for (int i = 0; i <= daysInMonths.length; i++) {
//            sumOfDays = sumOfDays + daysInMonths[i];
//            monthCount = monthCount + i;
//            if (sumOfDays> day256){
//                break;
//            }
//        }
//
//        int dayOfMonth = (daysInMonths[monthCount] - (sumOfDays - day256)) - 1;
//        System.out.println(dayOfMonth);
//        return "";
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year =2017;
        int day256 = 256;
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 1.  find if the year is a leap year
        if (year <= 1917) {
            if (year % 4 == 0) {
                daysInMonths[1] = 29;
            } else {
                daysInMonths[1] = 28;
            }
        } else if (year == 1918) {
            daysInMonths[1] = 15;
        } else {
            if (year % 400 == 0 || year % 100 != 0 && year %4 ==0) {
                daysInMonths[1] = 29;
            } else {
                daysInMonths[1] = 28;
            }
        }

        int sumOfDays = 0;
        int monthCount = 0;

        for (int i = 0; i <= daysInMonths.length; i++) {
            sumOfDays = sumOfDays + daysInMonths[i];
            monthCount = monthCount + 1;
            if (sumOfDays > day256) {
                break;
            }
        }

        int dayOfMonth = (daysInMonths[monthCount] - (sumOfDays- day256)) - 1;

        if (monthCount < 10){
            System.out.println(dayOfMonth + ".0" + monthCount + "." + year);
        } else {
            System.out.println(dayOfMonth + "." + monthCount + "." + year);
        }




    }
}
