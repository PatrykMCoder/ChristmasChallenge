import java.util.ArrayList;
import java.util.List;

class DayTwo {
    public static void main(String[] args) {
        List<String> ideas = List.of(
                "Perfume", "Socks", "Sweater", "Cup",
                "Hat", "Tea", "Coffee", "Clock", "Bag",
                "Book", "Wallet", "Cream", "Earrings");
        ArrayList<String> selectedItems = new ArrayList<>();
        
        int min = 0;
        int max = ideas.size() - 1;
        int MAX_ITEMS = 3;
        
        String item = "";
        
        boolean allCollected = false;
        int countCollected = 0;
        
        String result = "Collected items: ";
        
        while(!allCollected) {
            item = ideas.get(getRandomNumber(min, max));
            if (isNotDuplicated(item, selectedItems)) {
                selectedItems.add(item);
                countCollected++;
            }
            allCollected = (countCollected == MAX_ITEMS);
        }

        StringBuilder stringBuilder = new StringBuilder(result);
        for (String s : selectedItems) {
            stringBuilder.append(s + " ");
        }

        System.out.println(stringBuilder.toString());
    }

    private static int getRandomNumber(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }

    private static boolean isNotDuplicated(String item, ArrayList<String> items) {
        boolean duplicated = false;
        if (items.size() == 0) return !duplicated;
        for(int i = 0; i <= items.size() - 1; i++) {
            if (items.get(i).equals(item)) {
                duplicated = true;
                break;
            }
        }
        return !duplicated;
    }
}
