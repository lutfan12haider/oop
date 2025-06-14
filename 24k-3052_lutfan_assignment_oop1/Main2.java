package assignment;

public class Main2 {
    public static void main(String[] args) {

        Skill skill1 = new Skill(1, "Bowler", "Right-Handed");

        Sport sport1 = new Sport(1, "Cricket", "Bat and Ball Game", skill1.skillName);

        Mentor mentor1 = new Mentor(1, "Lutfan", skill1.skillName);

        Student student1 = new Student(1, "Ali");

        student1.assignSport(sport1);
        student1.assignMentor(mentor1);

        student1.displayDetailStudent();
    }
}

