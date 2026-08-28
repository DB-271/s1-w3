public class Score {
    private int score;

    public Score() {
        score = 50;
    }
    public void increaseScore(int points) {
        score += points;
    }
    public void decreaseScore(int points) {
        score -= points;
    }
    public int currentScore() {
        return score;
    }
}

