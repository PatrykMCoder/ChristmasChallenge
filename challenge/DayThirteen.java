import java.util.ArrayList;
import java.util.List;

public class DayThirteen {
    public static void main(String[] args) {
        List<String> fixedNames = new ArrayList<>();
        List<String> names = new ArrayList<>();
        names.add("Uisaj");
        names.add("Aisak");
        names.add("Aisa");
        names.add("Kemot");
        names.add("Lahcim");
        
        for (String name : names) {
            fixedNames.add(fixName(name));
        }
       
        System.out.println(fixedNames);
    }

    private static String fixName(String name) {
        String last = String.valueOf(name.charAt(name.length() - 1)).toUpperCase();
        String first = String.valueOf(name.charAt(0)).toLowerCase();
        String nameToFix = first + name.substring(1, name.length() - 1) + last;
        StringBuilder stringBuilder = new StringBuilder(nameToFix);
        return stringBuilder.reverse().toString();
    }
}
