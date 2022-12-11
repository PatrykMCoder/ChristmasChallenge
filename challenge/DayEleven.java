import java.util.HashMap;
import java.util.Map;
import java.util.List;

import model.Envelope;
import model.Gift;

public class DayEleven {
    private static Envelope small = new Envelope(10, 15);
    private static Envelope medium = new Envelope(20, 30);
    private static Envelope big = new Envelope(30, 30);

    private static int smallSpace = calculateSpace(small.getWidth(), small.getHeight());
    private static int mediumSpace = calculateSpace(medium.getWidth(), medium.getHeight());
    private static int bigSpace = calculateSpace(big.getWidth(), big.getHeight());
    public static void main(String[] args) {
        List<Gift> gifts = prepareGifts();
        Map<String, String> envelopeData = new HashMap<>();

        gifts.forEach(gift -> {
            int giftSpace = calculateSpace(gift.getWidth(), gift.getHeight());
            envelopeData.put(gift.getName(), prepareGoodEnvelope(giftSpace));
        });

        envelopeData.forEach((k, v) -> {
            System.out.println("For gift: " + k + " the best envelope is: " + v);
        });
    }

    private static String prepareGoodEnvelope(int giftSpace) {
        if (giftSpace >= bigSpace) {
            return "No envelope for that gift :(";
        } else if (giftSpace >= smallSpace && giftSpace < mediumSpace) {
            return "Medium envelope";
        } else if (giftSpace >= mediumSpace && giftSpace < smallSpace) {
            return "Small envelope";
        } else if (giftSpace < smallSpace) {
            return "Small envelope";
        } else if (giftSpace >= mediumSpace && giftSpace < bigSpace){
            return "Big envelope";
        }else {
            return "Brak danych";
        }
    }

    private static int calculateSpace(int w, int h) {
        return w * h;
    }

    private static List<Gift> prepareGifts() {
        return List.of(
                new Gift("Parfum", 12, 30),
                new Gift("Socks", 10, 10),
                new Gift("Book", 30, 25),
                new Gift("Clock", 15, 15),
                new Gift("Wallet", 5, 10)
        );
    }
}
