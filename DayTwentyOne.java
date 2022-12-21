public class DayTwentyOne {
    public static void main(String[] args) {
        int places = 10;
        int reindeers = 100;

        System.out.println("Before switch: places = " + places);
        System.out.println("Before switch: reindeers = " + reindeers);
        
        places = places + reindeers;
        reindeers = places - reindeers;
        places = places - reindeers;
        
        System.out.println("After switch: places = " + places);
        System.out.println("After switch: reindeers = " + reindeers);
    }
}
