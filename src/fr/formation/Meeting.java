package fr.formation;

public abstract class Meeting {
    protected int middleScore1;
    protected int middleScore2;
    protected int finalScore1;
    protected int finalScore2;

    public Meeting() {
        this.middleScore1 = Utils.randIntBetween (0, 3);
        this.middleScore2 = Utils.randIntBetween (0, 3);
        this.finalScore1 = (middleScore1 < 3)? Utils.randIntBetween (middleScore1, 3) : 3;
        this.finalScore2 = (middleScore2 < 3)? Utils.randIntBetween (middleScore2, 3) : 3;
    }

    public abstract void playMatch(String refereeName);

}
