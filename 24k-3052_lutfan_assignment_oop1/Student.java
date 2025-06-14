package assignment;


public class Student {
    int studentID;
    String studentName;
    Sport sportInterest;
    Mentor mentorAssigned;

    public Student(int id, String name) {
        this.studentID = id;
        this.studentName = name;
    }

    public void assignMentor(Mentor m) {
        if(m != null) {
            mentorAssigned = m;
            m.assignLearner(this);
        }
    }

    public void assignSport(Sport s) {
        if(s != null) {
            sportInterest = s;
        }
    }

    public void displayDetailStudent() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        if (sportInterest != null) {
            System.out.println("Sport Interest: " + sportInterest.sportName);
        }
        if (mentorAssigned != null) {
            System.out.println("Mentor Assigned: " + mentorAssigned.mentorName);
        }
    }
}