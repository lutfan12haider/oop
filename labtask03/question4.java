package labtask03;

public class question4 {
    private String courseCode;
    private String courseName;
    private int creditHours;

    public question4(String courseCode, String courseName, int creditHours) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setCreditHours(creditHours);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        if (courseCode.matches("[A-Z]{2}\\d{3}")) {
            this.courseCode = courseCode;
        } else {
            throw new IllegalArgumentException("Invalid course code format. Example: CS101");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        if (creditHours >= 1 && creditHours <= 4) {
            this.creditHours = creditHours;
        } else {
            throw new IllegalArgumentException("Credit hours must be between 1 and 4.");
        }
    }

    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
    }
}
