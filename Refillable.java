public class Refillable {
    private int container;
    private int totalUsed;
    private int totalTimeUsedHappens;

    public Refillable() {
        container = 10;
    }
    public Refillable(int amount) {
        container = amount;
    }
    public void useUp(int amount) {
        container -= amount;
        totalUsed += amount;
        totalTimeUsedHappens++;
    }   
    public int addTo(int amount) {
        container += amount;
        return container;
    }
    public int currentAmount() {
        return container;
    }
}
