import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.PI;

import java.math.BigDecimal;
import java.math.MathContext;

public class DayFiveteen {
    public static void main(String[] args) {
        Map<String, Integer> ingredientsForRectangleForm = Map.of(
            "Maka", 300,
            "Cukier", 100,
            "Jajka", 4,
            "Czekolada", 200,
            "Maslo", 200);

            System.out.println(prepareForCircleForm(new int[]{20, 30}, 9.8, ingredientsForRectangleForm));
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

    private static Map<String, BigDecimal> prepareForCircleForm(int[] rectangularForm, double dCircleForm, Map<String, Integer> ingredientsForRectangleForm) {  
        Map<String, BigDecimal> ingredientsForCircleForm = new HashMap<>();
        double fieldCircleForm = PI * Math.pow(dCircleForm / 2, 2);

        double fieldRectangularForm = rectangularForm[0] * rectangularForm[1];
        ingredientsForRectangleForm.forEach((k,v) -> {
            double d = (fieldCircleForm * v) / fieldRectangularForm;
            ingredientsForCircleForm.put(k, new BigDecimal(d).setScale(0, BigDecimal.ROUND_HALF_UP));
        });
        
        return ingredientsForCircleForm;
    }
}
