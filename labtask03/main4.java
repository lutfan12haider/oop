package labtask03;

public class main4 {
    public static void main(String[] args) {
        try {
            question4 course = new question4("CS101", "Introduction to Programming", 3);
            course.displayCourseDetails();

            course.setCourseCode("CS102");
            course.setCourseName("Data Structures");
            course.setCreditHours(4);

            System.out.println("\nUpdated Course Details:");
            course.displayCourseDetails();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
