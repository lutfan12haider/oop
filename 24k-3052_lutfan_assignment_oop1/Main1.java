package assignment;

public class Main1 {
    public static void main(String[] args) {

        Game game = new Game("Team-1", "Team-2");
        System.out.println("Game initialized with " + game.teamOne.TeamName + " and " + game.teamTwo.TeamName);

        Robot robot = game.teamOne.Player;

        System.out.println("Moving ball...");
        robot.ballMovement(5, 10);
        System.out.print("Current Ball Position: ");
        robot.displayCurrentPosition();

        System.out.println("Robot hitting ball...");
        robot.hitBall(15, 20, "north-east");
        System.out.print("After hit, Ball Position: ");
        robot.displayCurrentPosition();
        System.out.println("Direction of ball: " + robot.Ball_pos.direction);

        System.out.println("Setting goal position...");
        robot.setGoal(15, 20);
        System.out.println("Goal Position: (" + robot.G_position.GoalX + "," + robot.G_position.GoalY + ")");

        System.out.println("Checking if goal reached...");
        robot.Ball_pos.isGoalReached(robot.G_position.GoalX, robot.G_position.GoalY);
    }
}
