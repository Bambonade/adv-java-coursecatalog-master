package lab1;

public class Main {
    public static void main(String[] args) {
        Course course1 = new IntroJavaCourse("Intro Java Course", "110");
        Course course2 = new AdvancedJavaCourse("Advanced Java Course", "111");
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", "112");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}