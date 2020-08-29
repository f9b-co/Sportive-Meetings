package fr.formation;

import java.util.Objects;

public class TeamMeeting extends Meeting {

    private Team team1;
    private Team team2;

    public TeamMeeting(Team team1, Team team2) {
        super();
        this.team1 = Objects.requireNonNull(team1,"team1 cannot be null");
        this.team2 = Objects.requireNonNull(team2,"team2 cannot be null");
    }

    public void playMatch(String refereeName) {
        String result = "- " + refereeName + " arbitre la partie collective : " +
                team1.getName() + "(" + team1.getAthletesTeam().size() + ")" + " vs " +
                team1.getName() + "(" + team1.getAthletesTeam().size() + ")\n" +
                "\t* Mi-temps : " + middleScore1 + "-" + middleScore2 + "\n" +
                "\t* Fin de partie : " + finalScore1 + "-" + finalScore2;
        System.out.println(result);;
    };

}
