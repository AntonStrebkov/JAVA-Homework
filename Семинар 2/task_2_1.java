import java.lang.System.Logger;
import java.lang.System.LoggerFinder;

/**
 * task_2_1
 */
public class task_2_1 {
    Logger logger = (Logger) LoggerFinder.getLoggerFinder();

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        } catch (NullPointerException nullPointerException) {
            logger.info();
        }

    }

}