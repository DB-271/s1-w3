public class RefillableMain {
    public static void main(String[] args) {
        Refillable r = new Refillable();
        r.addTo(4);
        System.out.println(r.currentAmount());
        r.useUp(4);
        System.out.println(r.currentAmount());
    }
}
