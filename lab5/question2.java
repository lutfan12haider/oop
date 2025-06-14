package lab5;
import java.util.*;

class Course {
    String courseCode;
    String courseName;
    Instructor instructor;
    List<Student> enrolledStudents;
    List<Assignment> assignments;

    Course(String courseCode, String courseName, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
        this.assignments = new ArrayList<>();
        instructor.addCourse(this);
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollInCourse(this);
    }

    void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    void showDetails() {
        System.out.println("Course: " + courseCode + " - " + courseName);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name + " (" + s.rollNumber + ")");
        }
        System.out.println("Assignments:");
        for (Assignment a : assignments) {
            System.out.println("- " + a.title + " (Due: " + a.dueDate + ")");
        }
    }
}

class Instructor {
    String name;
    String department;
    List<Course> courses;

    Instructor(String name, String department) {
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    void addCourse(Course course) {
        courses.add(course);
    }
}

class Student {
    String rollNumber;
    String name;
    String program;
    List<Course> courses;
    List<Assignment> assignments;

    Student(String rollNumber, String name, String program) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.program = program;
        this.courses = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    void enrollInCourse(Course course) {
        courses.add(course);
    }

    void completeAssignment(Assignment assignment) {
        assignments.add(assignment);
    }
}

class Assignment {
    String title;
    String dueDate;
    String description;
    Course course;

    Assignment(String title, String dueDate, String description, Course course) {
        this.title = title;
        this.dueDate = dueDate;
        this.description = description;
        this.course = course;
        course.addAssignment(this);
    }
}