import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();


        danhSachSV.offer("TH11");
        danhSachSV.offer("TH12");
        danhSachSV.offer("TH10");
        danhSachSV.offer("TH09");
        danhSachSV.offerLast("TH100");
        danhSachSV.offerFirst("TH01");

        while(true) {
            String s = danhSachSV.poll();
            if(s == null){
                break;
            }
            System.out.println(s);
        }

    }
}