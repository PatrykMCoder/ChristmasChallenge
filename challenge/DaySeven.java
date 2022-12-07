import java.util.HashMap;

public class DaySeven {
    public static void main(String[] args) {
        int height = 15;
        for (int i = 0; i <= height; i++) {
            System.out.println("");
            for (int j = height - i; j >= 0; j--) {    
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
        }
        for (int i = height; i >= 0; i--) {
            System.out.println("");
           
            for (int j = 0; j <=  height - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print("* ");
            }
        }
    }
}
