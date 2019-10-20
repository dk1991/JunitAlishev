import java.util.concurrent.TimeUnit;

public class NetworkUtils {
    public static void getConnection() {
        // получаем соединение с сервером
        try {
            TimeUnit.MILLISECONDS.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}
