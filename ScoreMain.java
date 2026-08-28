public class ScoreMain {
    public static void main(String[] args) {
        Score score1 = new Score();
        score1.increaseScore(100);
        score1.decreaseScore(10);
        System.out.println(score1.currentScore());
    }
}
