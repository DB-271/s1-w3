public class CokeCoolerMain {
    public static void main(String[] args) {
        CokeCooler cooler1 = new CokeCooler();
        cooler1.drink(20);
        cooler1.refill();
        cooler1.printState();

        CokeCooler cooler2 = new CokeCooler();
        cooler2.drink(90);
        cooler2.refill();
        cooler2.printState();
    }   
}
