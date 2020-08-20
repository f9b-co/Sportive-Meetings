package fr.formation;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static int randIntBetween (int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public static List<Team> populateTeam(List<String> namesList, int athletesNum, String teamName, List<Team> teamsList){

        List<Athlete> athletesList = new ArrayList<>(athletesNum);
        for (int i = 0; i < athletesNum; i++) {
            Athlete a = new Athlete(namesList.get(i));
            athletesList.add(a);
        }
        teamsList.add(new Team(teamName, athletesList));
        return  teamsList;
    }



}
