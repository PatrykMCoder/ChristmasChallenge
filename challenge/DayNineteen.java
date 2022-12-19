import model.Box;

public class DayNineteen {

    // Ma 5 pudełek o wielkości 10cmx13cmx15cm, 10 o wielkości 20cmx15cmx10cm i 3 o wielkości 30cmx25cmx20cm.
    public static void main(String[] args) {
        Box small = new Box(10, 13, 15);
        Box medium = new Box(20, 15, 10);
        Box big = new Box(30, 25, 20);

        double smallField = calulateField(small.getX(), small.getZ(), small.getY());
        double mediumField = calulateField(medium.getX(), medium.getZ(), medium.getY());
        double bigField = calulateField(big.getX(), big.getZ(), big.getY());

        double papperForSmall = calculateNeededPaper(smallField, 5);
        double paperForMedium = calculateNeededPaper(mediumField, 10);
        double paperForBig = calculateNeededPaper(bigField, 3);

        double allPaperInCm2 = papperForSmall + paperForMedium + paperForBig;
        
        System.out.println("Santa need " + Math.ceil(convertToM2(allPaperInCm2)) + "m2 paper");

    }

    private static double calulateField(int a, int b, int c) {
        return (2* a * b) + (2 * b * c) + (2 * a * c);
    }

    private static double calculateNeededPaper(double filedBox, int amount) {
        return filedBox * amount;
    }

    private static double convertToM2(double cm2) {
      return cm2 / 10000;
    }
}
