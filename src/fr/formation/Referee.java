package fr.formation;

public class Referee {

    private String name;

    public Referee(String name) {
        this.name = name;
    }

    public void launchMatch(Meeting meeting) {
        meeting.playMatch(this.name);
    };

    public String getName() {
        return name;
    }
}
