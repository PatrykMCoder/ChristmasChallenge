package daysix;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class DaySix {
    public static void main(String[] args) {
        List<Recipe> recipes = prepareRecipes();
        Map<String, Integer> shopingList = new HashMap<String, Integer>();

        recipes.forEach(recipe -> {
            recipe.getIngredients().forEach((key, value) -> {
                if (shopingList.get(key) != null) {
                    shopingList.computeIfPresent(key, (k, v) -> v + value);
                } else {
                    shopingList.put(key, value);
                }
            });
        });

        System.out.println(shopingList);
    }

    private static List<Recipe> prepareRecipes() {
        return List.of(
                new Recipe(
                        "Murzynek",
                        Map.of(
                                "Maka", 300,
                                "Cukier", 100,
                                "Jajka", 3,
                                "Czekolada", 200,
                                "Maslo", 200),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Piernik",
                        Map.of(
                                "Maka", 500,
                                "Cukier", 180,
                                "Miod", 250,
                                "Jajka", 1,
                                "Mleko", 80,
                                "Maslo", 150),
                        "Piekarnik nagrzać do temp. 180 stopni [...]"),
                new Recipe(
                        "Sernik",
                        Map.of(
                                "Maka", 100,
                                "Cukier", 200,
                                "Jajka", 6,
                                "Ser", 1000,
                                "Maslo", 200),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Uszka",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Sol", 1,
                                "Maslo", 200,
                                "Grzyby", 150,
                                "Cebula", 1),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Barszcz",
                        Map.of(
                                "Buraki", 1000,
                                "Bulion", 1500,
                                "Zakwas", 200,
                                "Sol", 1),
                        "Buraki rozdrobnić i zagotować z bulionem [...]"),
                new Recipe(
                        "Pierogi",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Kapusta", 500,
                                "Grzyby", 50,
                                "Cebula", 1),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Karp",
                        Map.of(
                                "Karp", 1000,
                                "Maka", 50,
                                "Mleko", 500,
                                "Sol", 1,
                                "Olej", 500),
                        "Rybę umyć i pokroić w dzwonki [...]"));
    }
}