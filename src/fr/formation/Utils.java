package fr.formation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    public static int randIntBetween (int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("max("+max+") must be greater than min("+min+")");
        }
    return ThreadLocalRandom.current().nextInt(min, max + 1);
        //return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    public static List<Team> buildTeam(List<String> namesList, int athletesNum, String teamName, List<Team> teamsList){

        List<Athlete> athletesList = new ArrayList<>(athletesNum);
        for (int i = 0; i < athletesNum; i++) {
            int randIndex = Utils.randIntBetween(0, namesList.size() - 1);
            Athlete a = new Athlete(namesList.get(randIndex));
            namesList.remove(randIndex);
            athletesList.add(a);
        }
        teamsList.add(new Team(teamName, athletesList));
        return  teamsList;
    }



}
