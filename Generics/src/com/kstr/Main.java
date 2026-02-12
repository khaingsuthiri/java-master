package com.kstr;

record BaseballPlayer(String name, String position) {
}

public class Main {
    public static void main(String[] args) {

        BaseballTeam teamA = new BaseballTeam("Team A");
        BaseballTeam teamB = new BaseballTeam("Team B");
        scoreResult(teamA, 3, teamB, 5);

        var player1 = new BaseballPlayer("Alice", "Right Fielder");
        var player2 = new BaseballPlayer("Bob", "Right Fielder");

        teamA.addTeamMember(player1);
        teamA.addTeamMember(player2);
        teamA.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
