public class DayOne
{
    public static void main(String[] args) {
        double[] xPoints = new double[]{1, 4, 11};
        double[] yPoints = new double[]{1, 5, 5};
        double usedMagicFuel = 0.0;
        double x1, x2;
        double y1, y2;
        double stops = xPoints.length - 1; // we have one less stop than all points: first point is start.
        
        double xStart = xPoints[0];
        double yStart = yPoints[0];

        double distanceBeetweenStartAndFirstStop = DayOne.calculateDistance(xStart, xPoints[1], yStart, yPoints[1]);
        double distance = distanceBeetweenStartAndFirstStop;
        for (int i = 1; i < stops; i++) {
            x1 = xPoints[i];
            y1 = yPoints[i];
            
            x2 = xPoints[i + 1];
            y2 = yPoints[i + 1];

            distance += DayOne.calculateDistance(x1, x2, y1, y2);
            usedMagicFuel = (distance * 20) / 10;
        }

        System.out.println("Used magic fuel: " + usedMagicFuel);
    }


    private static double calculateDistance(double x1, double x2, double y1, double y2) { 
        return Math.sqrt(Math.pow(x2 - x1, 2) +  Math.pow(y2 - y1, 2));
    }
}