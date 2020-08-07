package GradingStudents;

import javax.xml.transform.Result;
import java.util.List;

public class GradingStudentsII {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)>=38){
                int rawGrade =grades.get(i);
                int r = grades.get(i) % 5;
                int difference=5-rawGrade;
                if(rawGrade >= 3){
                    grades.set(i,(rawGrade + difference));
                }
            }
        }
        return grades;
    }
}
