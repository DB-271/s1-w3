public class CokeCooler {
    private int amountOfCokes;
    public CokeCooler() {
        amountOfCokes = 100;
    }
    public void drink(int amount) {
        amountOfCokes -= amount;
    }
    public int refill() {
        if (amountOfCokes < 100) {
            amountOfCokes += 100;
        }
        return amountOfCokes;
    }
    public int cokeCount() {
        return amountOfCokes;
    }
    public void printState() {
        System.out.println("Current coke amount: " + amountOfCokes);
    }
}
