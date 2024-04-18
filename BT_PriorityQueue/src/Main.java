import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new PriorityQueue<String>();

        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van C");
        danhSachSV.offer("Nguyen Van E");
        danhSachSV.offer("Nguyen Van B");

        while(true) {
            String s = danhSachSV.poll();
            if(s == null){
                break;
            }
            System.out.println(s);
        }
    }
}