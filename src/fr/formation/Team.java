package fr.formation;

import java.util.ArrayList;
import java.util.List;

public class Team extends Opponent{

    private List<Athlete> athletesTeam = new ArrayList<>();

    public Team(String name, List<Athlete> athletes) {
        super(name);
        if (athletes.size() < 2 || athletes.size() > 11){
            throw new IllegalArgumentException("a team requires from 2 to 11 athletes");
        } else {
            for (Athlete a : athletes) {
                athletesTeam.add(a);
            };
        }
    }

    public List<Athlete> getAthletesTeam() {
        return athletesTeam;
    }

    @Override
    public String toString() {
        return super.getName() + "(" + athletesTeam.size() + ")";
    }
}
