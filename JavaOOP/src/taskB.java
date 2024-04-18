public class taskB implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Task BBBBBB");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
