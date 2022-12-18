
public class DaySeventeen {
    public static void main(String[] args) {
        int height = 20;
        int radius = height / 2;
        int posX = height;
        int posY = height;
        char[] chars = {'#', '*'};
        for (int i = 0; i < posX + radius; i++) {
            for (int j = 0; j < posY + radius; j++) {
                int xSquare = (int)Math.pow(i - posX, 2); 
                int ySquare = (int)Math.pow(j - posY, 2); 
                if (xSquare + ySquare <= radius) {
                    int random = (int)((Math.random() * (chars.length - 0)) + 0);
                    System.out.print(chars[random]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
