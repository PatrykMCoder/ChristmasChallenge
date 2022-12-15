import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.PI;

public class DayFiveteen {
    public static void main(String[] args) {
        Map<String, Integer> ingredientsForRectangleForm = Map.of(
            "Maka", 300,
            "Cukier", 100,
            "Jajka", 4,
            "Czekolada", 200,
            "Maslo", 200);

            System.out.println(prepare(new int[]{20, 30}, 9.8, ingredientsForRectangleForm));
    }


    /*
     * 
     *  c - fieldCircleForm
     *  b - fieldRectangularForm
     *  a - ingredient
     * 
     *  d = (c * b) / a
     * 
     */

    private static Map<String, Integer> prepare(int[] rectangularForm, double rCircleForm, Map<String, Integer> ingredientsForRectangleForm) {  
        Map<String, Integer> ingredientsForCircleForm = new HashMap<String, Integer>();
        double fieldCircleForm = PI * Math.pow(rCircleForm, 2);
        double fieldRectangularForm = rectangularForm[0] * rectangularForm[1];
        ingredientsForRectangleForm.forEach((k,v) -> {
            double d = (fieldCircleForm * v) / fieldRectangularForm;
            ingredientsForCircleForm.put(k, (int)d);
        });
        
        return ingredientsForCircleForm;
    }
}
