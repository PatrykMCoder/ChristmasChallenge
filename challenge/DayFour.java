import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class DayFour {
    public static void main(String[] args) {
        List<String> ideas = List.of(
            "Parfum", "Socks", "Sweather", "Cup",
            "Hat", "Tea", "Coffee", "Clock", "Bag",
            "Book", "Wallet", "Cream", "Earrings");
            ArrayList<BinaryWord> binaryWords = new ArrayList<>();
        
        ideas.forEach(idea -> {
            BinaryWord binaryWord = new BinaryWord();

            try {
                byte[] b = idea.getBytes("UTF8");
                for(int i = 0; i < b.length; i++) {
                    binaryWord.putBinaryLetter(Integer.toBinaryString(b[i]));
                }
                binaryWords.add(binaryWord);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        });

        // Display binary words
        binaryWords.forEach(bw -> {
            bw.getBinaryLetters().forEach(bl -> {
                System.out.print(bl + " ");
            });
            System.out.println("");
        });
    }
}

class BinaryWord {
    private ArrayList<String> binaryLetters;

    public BinaryWord() {
        binaryLetters = new ArrayList<>();
    }

    public void putBinaryLetter(String bin) {
        binaryLetters.add(bin);
    }

    public ArrayList<String> getBinaryLetters() {
        return binaryLetters;
    }

}