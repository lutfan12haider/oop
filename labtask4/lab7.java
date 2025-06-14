package labtask4;

public class lab7 {
    private String projectName;
    private String deadline;
    private double budget;

    public lab7() {
        this.projectName = "Default Project";
        this.deadline = "No Deadline";
        this.budget = 0.0;
    }

    public lab7(String projectName, String deadline) {
        this.projectName = projectName;
        this.deadline = deadline;
        this.budget = 0.0;
    }

    public lab7(String projectName, String deadline, double budget) {
        this.projectName = projectName;
        this.deadline = deadline;
        this.budget = budget;
    }

    public void displayProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Deadline: " + deadline);
        System.out.println("Budget: " + budget);
    }
}
