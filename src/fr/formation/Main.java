package fr.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> starWarsNames = Arrays.asList("Boba Fett", "C-3PO", "Chewbacca", "Dark Vador", "Empereur Palpatine", "Han Solo", "Jar Jar Binks", "Luke Skywalker", "Obi-Wan Kenobi", "Princesse Leia", "R2D2");
        List<String> starTrekNames = Arrays.asList("docteur Leonard McCoy","lieutenant Hikaru Sulu","lieutenant Commandeur Montgomery Scott","Monsieur Spock","infirmière Christine Chapel","lieutenant Nyota Uhura","enseigne Pavel Chekov","capitaine James T. Kirk","yeoman Janice Rand","ambassadeur Sarek","Tina Lawton");

        int athletesNum = Utils.randIntBetween(2, 11);
        List<Team> teamsList = new ArrayList<>();
        Utils.populateTeam(starWarsNames, athletesNum, "StarWarsTeam", teamsList);
        Utils.populateTeam(starTrekNames, athletesNum, "StarTrekTeam", teamsList);

        for (Team t : teamsList) {
            System.out.println(t);
            System.out.println(t.getAthletesTeam());
        }

        for (int i = 0; i < 2; i++) {
            int randIndex1 = Utils.randIntBetween(0, athletesNum - 1);
            int randIndex2 = Utils.randIntBetween(0, athletesNum - 1);
            Meeting m = new Meeting(teamsList.get(0).getAthletesTeam().get(randIndex1), teamsList.get(1).getAthletesTeam().get(randIndex2));
            m.playMatch();
        }

        Meeting m1 = new Meeting(teamsList.get(0), teamsList.get(1));
        m1.playMatch();
        m1.playMatch();
    }
}
