import java.util.List;

import model.Address;
import model.ChildWithAddress;

public class DayTwelve {
    public static void main(String[] args) {
        List<ChildWithAddress> children = prepareChildren();

        children.forEach(child -> {
            printAddress(child);
        });
        
    }
    
    private static void printAddress(ChildWithAddress child) {
        System.out.printf(
        """
        ====================
            %s %s
            %s/%s/%s
            %s, %s
        ====================
        """, child.getName(), child.getSurname(), child.getAddress().getStreet(), child.getAddress().getNumber(), child.getAddress().getFlatNumber(), child.getAddress().getCity(), child.getAddress().getZipCode());
    }

    private static List<ChildWithAddress> prepareChildren() {
        return List.of(
                new ChildWithAddress(
                        "Jasiu",
                        "Kowalski",
                        new Address("Serniczkowa",
                                "4B",
                                2,
                                "Krakow",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Kasia",
                        "Nowak",
                        new Address("Pierniczkowa",
                                "289",
                                55,
                                "Gdansk",
                                "02-326"
                        )),
                new ChildWithAddress(
                        "Asia",
                        "Wisniewska",
                        new Address("Barszczykowa",
                                "234",
                                5,
                                "Rzeszow",
                                "37-326"
                        )),
                new ChildWithAddress(
                        "Tomek",
                        "Wojcik",
                        new Address("Uszkowa",
                                "43H",
                                5,
                                "Wroclaw",
                                "02-326"
                        ))
        );
    }
}
