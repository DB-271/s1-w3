public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar jar1 = new CandyJar();
        jar1.eat(5);
        jar1.refill();
        jar1.printState();

        CandyJar jar2 = new CandyJar();
        jar2.eat(9);
        jar2.refill();
    }
}
