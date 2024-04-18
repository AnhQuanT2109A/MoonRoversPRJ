import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stackChuoi = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bạn muốn:");
        String s1 = sc.nextLine();
        for(int i = 0; i < s1.length(); i++){
            stackChuoi.push(s1.charAt(i)+"");
        }

        System.out.println("Kết quả:");
        for(int i = 0; i < s1.length(); i++){
            System.out.print(stackChuoi.pop());
        }
    }
}