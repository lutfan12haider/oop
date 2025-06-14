package lab5;
public class Main3{
    public static void main(String[] args) {
        lab5.Competition codingChallenge = new lab5.Competition("Coding Challenge 2025");

        lab5.Problem problem1 = new lab5.Problem("Implement Fibonacci sequence", "Easy", codingChallenge);
        lab5.Problem problem2 = new lab5.Problem("Solve Traveling Salesman Problem", "Hard", codingChallenge);

        codingChallenge.addProblem(problem1);
        codingChallenge.addProblem(problem2);

        lab5.Participant lutfan = new lab5.Participant("lutfan");
        lab5.Participant haider = new lab5.Participant("haider");

        codingChallenge.registerParticipant(lutfan);
        codingChallenge.registerParticipant(haider);

        lutfan.submitSolution(problem1, "Recursive approach", true);
        haider.submitSolution(problem2, "Dynamic programming approach", false);

        codingChallenge.showDetails();
    }
}