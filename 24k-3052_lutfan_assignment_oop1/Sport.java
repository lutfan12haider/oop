package assignment;

public class Sport {
    int sportID;
    String sportName;
    String sportDescription;
    String sportRequiredSkill;

    public Sport(int id, String name, String description, String requiredSkill) {
        this.sportID = id;
        this.sportName = name;
        this.sportDescription = description;
        this.sportRequiredSkill = requiredSkill;
    }

    public void addSkill(Skill sk) {
        this.sportRequiredSkill = sk.skillName;
    }
}
