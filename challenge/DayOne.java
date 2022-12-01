public class DayOne
{
    public static void main(String[] args) {
        double[] xPoints = new double[]{1, 4, 11};
        double[] yPoints = new double[]{1, 5, 5};
        double usedMagicFuel = 0.0d;
        double distance;
        double x1;
        double y1;

        for (int i = 0; i < xPoints.length - 1; i++) {
            x1 = xPoints[i];
            y1 = yPoints[i];
            double x2 = xPoints[i + 1];
            double y2 = yPoints[i + 1];

            double distanceX1X2 = Math.pow(x2 - x1, 2);
            double distanceY1Y2 = Math.pow(y2 - y1, 2);
            distance = Math.sqrt(distanceX1X2 + distanceY1Y2);
            System.out.println(distance);
            usedMagicFuel = (distance * 20) / 10;
        }

        System.out.println("Used magic fuel: " + usedMagicFuel);
    }
}