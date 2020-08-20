package fr.formation;

public class Athlete extends Opponent{

    public Athlete(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
