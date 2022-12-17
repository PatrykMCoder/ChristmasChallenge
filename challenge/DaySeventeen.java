
public class DaySeventeen {
    public static void main(String[] args) {
        int height = 60;
        int radius = height / 2;
        int posX = height;
        int posY = height;
        char[] chars = {'#', '*'};
        for (int i = 0; i < posX + radius; i++) {
            for (int j = 0; j < posY + radius; j++) {
                int xSquare = (i - posX) * (i - posX); 
                int ySquare = (j - posY) * (j - posY); 

                if (xSquare + ySquare - radius <= radius) {
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
