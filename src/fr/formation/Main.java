package fr.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> starWarsNames = new ArrayList<>(
                Arrays.asList("Boba Fett", "C-3PO", "Chewbacca", "Dark Vador", "Empereur Palpatine", "Han Solo",
                        "Jar Jar Binks", "Luke Skywalker", "Obi-Wan Kenobi", "Princesse Leia", "R2D2"));
        List<String> starTrekNames = new ArrayList<>(
                Arrays.asList("docteur Leonard McCoy", "lieutenant Hikaru Sulu", "lieutenant Commandeur Montgomery Scott",
                        "Monsieur Spock", "infirmière Christine Chapel", "lieutenant Nyota Uhura", "enseigne Pavel Chekov",
                        "capitaine James T. Kirk", "yeoman Janice Rand", "ambassadeur Sarek","Tina Lawton"));
        List<String> refereesNames = new ArrayList<>(
                Arrays.asList("Albator", "Capitaine Flame", "Actarus"));

        int athletesNum = Utils.randIntBetween(2, 11);
        List<Team> teamsList = new ArrayList<>();
        Utils.buildTeam(starWarsNames, athletesNum, "StarWarsTeam", teamsList);
        Utils.buildTeam(starTrekNames, athletesNum, "StarTrekTeam", teamsList);

        for (Team t : teamsList) {
            System.out.println(t + " " + t.getAthletesTeam());
            System.out.println();
        }

        for (int i = 0; i < athletesNum; i++) {
            int randIndex1 = Utils.randIntBetween(0, athletesNum - 1);
            int randIndex2 = Utils.randIntBetween(0, athletesNum - 1);
            IndividualMeeting m = new IndividualMeeting(teamsList.get(0).getAthletesTeam().get(randIndex1),
                    teamsList.get(1).getAthletesTeam().get(randIndex2));
            Referee refer = new Referee(refereesNames.get(Utils.randIntBetween(0, 2)));
            refer.launchMatch(m);
        }

        TeamMeeting m1 = new TeamMeeting(teamsList.get(0), teamsList.get(1));
        Referee refer = new Referee(refereesNames.get(Utils.randIntBetween(0, 2)));
        refer.launchMatch(m1);
    }
}
