package assignment;

public class Skill {
    int skillID;
    String skillName;
    String skillDescription;

    public Skill(int id, String name, String description) {
        this.skillID = id;
        this.skillName = name;
        this.skillDescription = description;
    }

    public void displaySkillDetail() {
        System.out.println("SKILL ID: " + skillID);
        System.out.println("Skill NAME: " + skillName);
        System.out.println("Skill Description: " + skillDescription);
    }

    public void updateSkillDescription() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter New Description: ");
        String des = scanner.nextLine();
        skillDescription = des;
        System.out.println("Updated");
    }
}





