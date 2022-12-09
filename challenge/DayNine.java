import java.util.ArrayList;
import java.util.List;

import model.Address;

public class DayNine {
    private static int count = 0;
    public static void main(String[] args) {
        List<Address> addresses = prepareAddresses();
        addresses.forEach(adress -> {
            String street = adress.getStreet();
            String number = adress.getNumber();
            String city = adress.getCity();
            countVowels(street);
            countVowels(number);
            countVowels(city);
        }); 

        System.out.println("Extra pay for non-premium: " + (DayNine.count * 2));
    }

    private static List<Character> prepareVowels() {
        List<Character> vowels = List.of('a', 'e', 'y', 'i', 'o', 'u');
        return vowels;
    }

    private static void countVowels(String s) {
        List<Character> vowels = prepareVowels();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.toLowerCase().charAt(i))) {
                count++;
            }
        }
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
                "289A",
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
        addresses.add(new Address("Cukierkowa",
                "23I",
                5,
                "Poznan",
                "02-326"
        ));


        return addresses;
    }
}
