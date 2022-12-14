import model.ChildWithBirthDate;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class DaySixteen {
    public static void main(String[] args) {
        List<ChildWithBirthDate> children = prepareChildren();
        children.stream().max(Comparator.comparing(ChildWithBirthDate::getDateOfBirth)).ifPresent(child -> System.out.println("Youngest: " + child));
        children.stream().min(Comparator.comparing(ChildWithBirthDate::getDateOfBirth)).ifPresent(child -> System.out.println("Oldest: " + child));
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
