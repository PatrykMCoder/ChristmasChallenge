import model.Box;

public class DayTwentyTwo {
    public static void main(String[] args) {
        Box box = new Box(10, 13, 15);
        int boxesAmount = 5;

        double firstRibbon = ((2 * box.getX()) + (2 * box.getY())) * 1.5; 
        double secondRibbon = ((2 * box.getX()) + (2 * box.getZ()))* 1.5; 

        double result = boxesAmount  * (firstRibbon + secondRibbon);
        System.out.println("Santa needs " + result / 100 + "m ribbon");
    }
}
