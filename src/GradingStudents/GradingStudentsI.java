package GradingStudents;

import java.util.ArrayList;
import java.util.List;

public class GradingStudentsI {
    public static void main(String[] args) {
        //if grade >= 38, round
        //if grade < 38, fail
        // if the difference between  the grade and the next multiple of 5 is less than 3, round the grade  to the next multiple of 5

        //for example: if grade = 84   -> round up to 85

        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
//        for (int grade : grades) {
//            System.out.println(grade);
//        }

//
//            int rawGrade = grades.get(2);
//            int r = rawGrade %  5;
//            System.out.println(r);
//            int difference = Math.abs(r-5);
//            System.out.println(difference);
//            System.out.println(rawGrade + difference);

        for (int i = 0; i < grades.size(); i++) {
            int rawGrade = grades.get(i);
            int r = rawGrade % 5;
            int difference = (5-r);
            if (rawGrade < 38) {
                System.out.println(rawGrade);
            } else if (rawGrade >= 38) {
                if (r >= 3) {
                    System.out.println(rawGrade + difference);
                }else {
                    System.out.println(rawGrade);
                }
            }
        }
    }
}

