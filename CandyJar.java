public class CandyJar {
    private int candyAmount;
    public CandyJar() {
        candyAmount = 10;
    }
    public void eat(int amount) {
        candyAmount -= amount;
    }
    public int refill() {
        if (candyAmount < 10) {
            candyAmount += 10;
        }
        return candyAmount;
    }
    public void printState() {
        System.out.println("Current candy amount: " + candyAmount);
    } 
}