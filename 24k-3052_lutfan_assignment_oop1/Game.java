package assignment;

public class Game {
    Team teamOne;
    Team teamTwo;

    public Game(String teamOneName, String teamTwoName) {
        teamOne = new Team(teamOneName);
        teamTwo = new Team(teamTwoName);
    }
}
