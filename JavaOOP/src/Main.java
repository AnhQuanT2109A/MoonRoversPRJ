public class Main {
    public static void main(String[] args) {
        System.out.println("Bat dau");

        Thread runB = new Thread(new taskB());
        runB.start();

        Thread th = new taskA();
        th.start();
    }
}