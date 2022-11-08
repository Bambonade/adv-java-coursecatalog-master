package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Brandon Nelson
 * @version 1.00
 */
public class IntroJavaCourse extends Course {
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "IntroJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
