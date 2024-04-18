import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Supplying: Bắt đầu một tác vụ bất đồng bộ và trả về một giá trị
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        });

        // Accepting: Bắt đầu một tác vụ bất đồng bộ mà không trả về giá trị
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            System.out.println("World");
        });

        // Chờ các tác vụ hoàn thành và lấy kết quả
        String result1 = future1.get();
        System.out.println(result1);

        future2.get();
    }
}
