package fr.formation;

import java.util.Objects;

public class IndividualMeeting extends Meeting {

    private Athlete athlete1;
    private Athlete athlete2;

    public IndividualMeeting(Athlete athlete1, Athlete athlete2) {
        super();
        this.athlete1 = Objects.requireNonNull(athlete1,"athlete1 cannot be null");
        this.athlete2 = Objects.requireNonNull(athlete2,"athlete2 cannot be null");
    }

    public void playMatch(String refereeName) {
        String matchDisplay = "- " + refereeName + " arbitre la partie individuelle : " +
                athlete1.getName() + " vs " + athlete2.getName() + "\n" +
                result;
        System.out.println(matchDisplay);
    }

}
