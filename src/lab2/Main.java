package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICourse> courses = new ArrayList<>();
        courses.add(new AdvancedJavaCourse("Advanced Java","110"));
        courses.add(new IntroJavaCourse("Intro to Java","111"));
        courses.add(new IntroToProgrammingCourse("Intro to Programming","112"));

        for (ICourse course: courses){
            System.out.println(course.getCourseName());
        }
    }
}
