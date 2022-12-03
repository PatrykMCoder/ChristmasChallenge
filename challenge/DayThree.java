import java.util.Scanner;

public class DayThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter height: ");
        int height = scanner.nextInt();
        scanner.close();

        // draw tree;
        for (int i = 0; i < height; i++) {
            System.out.println("");
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
        }

        // draw tree trunk
        for (int l = height / 3; l < height; l++) {
            System.out.println("");
            for (int j = height - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < height / 3; m++) {
                System.out.print("|");
            }
        }
    }
}
