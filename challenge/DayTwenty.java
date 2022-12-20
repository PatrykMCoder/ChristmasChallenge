import java.awt.Toolkit;

public class DayTwenty {

    public static void main(String[] args) {
        int intervalMs = 300;

        int[] tones = {
                2, 2, 4, 2, 2, 4, 2, 2, 2, 1, 8, 2, 2, 2, 1, 2, 2, 2, 1, 1,
                2, 2, 2, 2, 4, 4, 2, 2, 4, 2, 2, 4, 2, 2, 2, 1, 8, 2, 2, 2, 1,
                2, 2, 2, 1, 1, 2, 2, 2, 2, 8, 2, 2, 2, 2, 4, 1, 1, 2, 2, 2, 2, 8,
                2, 2, 2, 2, 8, 2, 2, 2, 2, 8, 2, 2, 2, 2, 8,
                2, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 8
        };

        System.out.println("Length: ");
        System.out.println("*".repeat(tones.length));

        try {
            for (int i : tones) {
                Toolkit.getDefaultToolkit().beep();
                System.out.print("*");
                Thread.sleep(intervalMs * i);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
