package lab5;
import java.util.*;

class Competition {
    String name;
    List<Problem> problems;
    List<Participant> participants;

    Competition(String name) {
        this.name = name;
        this.problems = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    void addProblem(Problem problem) {
        problems.add(problem);
    }

    void registerParticipant(Participant participant) {
        participants.add(participant);
        participant.registerForCompetition(this);
    }

    void showDetails() {
        System.out.println("Competition: " + name);
        System.out.println("Problems:");
        for (Problem p : problems) {
            System.out.println("- " + p.statement + " (" + p.difficulty + ")");
        }
        System.out.println("Participants:");
        for (Participant p : participants) {
            System.out.println("- " + p.name);
        }
    }
}

class Problem {
    String statement;
    String difficulty;
    List<Participant> attemptedBy;
    Competition competition;

    Problem(String statement, String difficulty, Competition competition) {
        this.statement = statement;
        this.difficulty = difficulty;
        this.competition = competition;
        this.attemptedBy = new ArrayList<>();
    }

    void attemptProblem(Participant participant) {
        attemptedBy.add(participant);
    }
}

class Participant {
    String name;
    List<Competition> competitions;
    List<Solution> solutions;

    Participant(String name) {
        this.name = name;
        this.competitions = new ArrayList<>();
        this.solutions = new ArrayList<>();
    }

    void registerForCompetition(Competition competition) {
        competitions.add(competition);
    }

    void submitSolution(Problem problem, String solutionCode, boolean isCorrect) {
        Solution solution = new Solution(this, problem, solutionCode, isCorrect);
        solutions.add(solution);
        problem.attemptProblem(this);
        System.out.println(name + " submitted solution for: " + problem.statement + " - " + (isCorrect ? "Correct" : "Incorrect"));
    }
}

class Solution {
    Participant participant;
    Problem problem;
    String solutionCode;
    boolean isCorrect;

    Solution(Participant participant, Problem problem, String solutionCode, boolean isCorrect) {
        this.participant = participant;
        this.problem = problem;
        this.solutionCode = solutionCode;
        this.isCorrect = isCorrect;
    }
}


