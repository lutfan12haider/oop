package assignment;


public class Mentor {
    int mentorID;
    String mentorName;
    String sportExpertise;
    int maxLearner = 3;
    String[] assignLearners = new String[3];
    int learnerCount = 0;

    public Mentor(int id, String name, String expertise) {
        this.mentorID = id;
        this.mentorName = name;
        this.sportExpertise = expertise;
    }

    public void addNewSkill(Skill sk) {
        this.sportExpertise = sk.skillName;
    }

    public void assignLearner(Student s) {
        if(learnerCount < maxLearner) {
            assignLearners[learnerCount] = s.studentName;
            learnerCount++;
        } else {
            System.out.println("No Vacancy");
        }
    }

    public void removeLearner(Student s) {
        int index = -1;
        for (int i = 0; i < learnerCount; i++) {
            if (assignLearners[i].equals(s.studentName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < learnerCount - 1; i++) {
                assignLearners[i] = assignLearners[i + 1];
            }
            learnerCount--;
        }
    }

    public void displayLearner() {
        for (int i = 0; i < learnerCount; i++) {
            System.out.println("Name: " + assignLearners[i]);
        }
    }
}
