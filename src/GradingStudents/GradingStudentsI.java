package GradingStudents;

import java.util.ArrayList;

public class GradingStudentsI {
    public static void main(String[] args) {
        //if grade >= 38, round
        //if grade < 38, fail
        // if the difference between  the grade and the next multiple of 5 is less than 3, round the grade  to the next multiple of 5

        //for example: if grade = 84   -> round up to 85

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(81);
        grades.add(73);
        grades.add(39);
        grades.add(30);
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
            int difference = Math.abs(r - 5);


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

