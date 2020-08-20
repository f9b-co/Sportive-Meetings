package fr.formation;

import java.util.Objects;

public class Meeting {

    private Opponent opponent1;
    private Opponent opponent2;
    private String type;

    public Meeting(Athlete opponent1, Athlete opponent2) {
        this.opponent1 = Objects.requireNonNull(opponent1,"opponent1 cannot be null");
        this.opponent2 = Objects.requireNonNull(opponent2,"opponent2 cannot be null");
        type = "- Individuelle : ";
    }
    public Meeting(Team opponent1, Team opponent2) {
        this.opponent1 = Objects.requireNonNull(opponent1,"opponent1 cannot be null");
        this.opponent2 = Objects.requireNonNull(opponent2,"opponent2 cannot be null");
        type = "- Collective : ";
    }

    public void playMatch(){
        int score1 = Utils.randIntBetween (0, 3);
        int score2 = Utils.randIntBetween (0, 3);
        String result = opponent1.toString() + " vs " + opponent2.toString() + " = " + score1 + "-" + score2;
        System.out.println(type + result);;
    };

}
