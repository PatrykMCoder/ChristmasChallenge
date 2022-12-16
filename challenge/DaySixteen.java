import model.ChildWithBirthDate;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class DaySixteen {
    public static void main(String[] args) {
        List<ChildWithBirthDate> children = prepareChildren();
        System.out.println("Children from youngest to oldest: ");
        children.stream().sorted(Comparator.comparing(ChildWithBirthDate::getDateOfBirth)).forEach(System.out::println);
    }

    private static List<ChildWithBirthDate> prepareChildren() {
        return List.of(
                new ChildWithBirthDate(
                        "Jasiu",
                        "Kowalski",
                        LocalDate.of(2010, 12, 30)
                ),
                new ChildWithBirthDate(
                        "Kasia",
                        "Nowak",
                        LocalDate.of(2011, 11, 30)),
                new ChildWithBirthDate(
                        "Asia",
                        "Wisniewska",
                        LocalDate.of(2010, 12, 31)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Wojcik",
                        LocalDate.of(2015, 6, 30)),
                new ChildWithBirthDate(
                        "Tomek",
                        "Zajac",
                        LocalDate.of(2020, 12, 30))
        );
    }
}
