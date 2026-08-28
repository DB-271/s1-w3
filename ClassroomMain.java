public class ClassroomMain {
    public static void main(String[] args) {
        Classroom room1 = new Classroom("John Teacher", 30, 25);
        System.out.println("Classroom 1 teacher: " + room1.teacher());
        System.out.println("Classroom 1 desks: " + room1.desks());
        System.out.println("Classroom 1 students: " + room1.students());
        System.out.printState();

        Classroom room2 = new Classroom("Jimmithy Teacher");
        System.out.println("Classroom 2 teacher: " + room2.teacher());

    }
}
