import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import model.Address;

public class DayEight {
    public static void main(String[] args) {
        List<Address> duplicated = prepareAddresses();

        Set<Address> fixedAddresses = new HashSet<>(duplicated);

        fixedAddresses.forEach(
            element -> {
                System.out.println(element);
            }
        );
    }

    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new Address("Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Barszczykowa",
                "234",
                5,
                "Rzeszow",
                "37-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Cukierkowa",
                "23",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }
}
