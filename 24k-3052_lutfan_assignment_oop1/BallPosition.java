package assignment;

public class BallPosition {
    int X;
    int Y;
    String direction;

    public void moveBall(int dx, int dy) {
        X = dx;
        Y = dy;
    }

    public void getPosition() {
        System.out.println("(" + X + "," + Y + ")");
    }

    public void isGoalReached(int ballX, int ballY) {
        if (X == ballX && Y == ballY) {
            System.out.println("Goal...!");
        }
    }
}

class GoalPosition {
    int GoalX;
    int GoalY;
}

class Robot {
    String RobotName;
    int RobotHitCount;
    BallPosition Ball_pos;
    GoalPosition G_position;

    public Robot() {
        Ball_pos = new BallPosition();
        G_position = new GoalPosition();
        RobotHitCount = 0;
    }

    public void setPlayerName(String name) {
        RobotName = name;
    }

    public void hitBall(int ballX, int ballY, String direction) {
        Ball_pos.X = ballX;
        Ball_pos.Y = ballY;
        Ball_pos.direction = direction;
        RobotHitCount++;
    }

    public void displayCurrentPosition() {
        System.out.println(Ball_pos.X + "," + Ball_pos.Y);
    }

    public void setGoal(int X, int Y) {
        G_position.GoalX = X;
        G_position.GoalY = Y;
    }

    public void ballMovement(int dx, int dy) {
        Ball_pos.X = dx;
        Ball_pos.Y = dy;
    }
}

class Team {
    String TeamName;
    Robot Player;

    public Team(String name) {
        Player = new Robot();
        Player.setPlayerName(name);
        TeamName = name;
    }
}



