public class DayTwentyThree {
    public static void main(String[] args) {
        int height = 15;
        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == 1 || j == height || j == i + 1  || j == height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
