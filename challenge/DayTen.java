public class DayTen {
    public static void main(String[] args) {
        int height = 13;

        for (int i = 0; i < height; i++){
            System.out.println("");
            for (int j = 0; j < height; j++) {
                if (i == 0 && (j >= height / 2 && j <= height - 5)) {
                    System.out.print("* ");
                } else if (i == 1 && (j == height / 2 - 1 || j == height - 3)) {
                    System.out.print("* ");
                }else if (i == 2 && (j == 4 || j == 11)){
                    System.out.print("* ");
                }else if(i == 3 && (j == 5 || j == 11)){
                    System.out.print("* ");
                }else if(i == 4 && (j == 6 || j == 11)){
                    System.out.print("* ");
                } else if (i >= 5 && j == 12) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
