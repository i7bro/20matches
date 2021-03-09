package entity;

public class Matches {

    public int countMatches;

    public Matches() {
        countMatches = 20;
    }

    public void calculateMatchesCount(int pickedUpMatches) {
        countMatches -= pickedUpMatches;
    }
}
