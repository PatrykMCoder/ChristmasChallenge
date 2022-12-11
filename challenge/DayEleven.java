import java.util.HashMap;
import java.util.Map;
import java.util.List;

import model.Envelope;
import model.Gift;

public class DayEleven {
    private static Envelope small = new Envelope(10, 15);
    private static Envelope medium = new Envelope(20, 30);
    private static Envelope big = new Envelope(30, 30);

    public static void main(String[] args) {
        List<Gift> gifts = prepareGifts();
        Map<Gift, Envelope> envelopeData = new HashMap<>();

        gifts.forEach(gift -> {
            envelopeData.put(gift, prepareGoodEnvelope(gift));
        });

        envelopeData.forEach((k, v) -> {
            System.out.println("For gift: " + k + " the best envelope is: " + v);
        });
    }

    private static Envelope prepareGoodEnvelope(Gift gift) {
        if (gift.getWidth() <= small.getWidth() && gift.getHeight() <= small.getHeight()) {
            return small;
        } else if(gift.getWidth() <= medium.getWidth() && gift.getHeight() <= medium.getHeight()) {
            return medium;
        } else if (gift.getWidth() <= big.getWidth() && gift.getHeight() <= big.getHeight()) {
            return big;
        } else {
            return null;
        }
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
