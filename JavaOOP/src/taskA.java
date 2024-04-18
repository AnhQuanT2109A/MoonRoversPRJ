public class taskA extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Task AAAAAAA");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
