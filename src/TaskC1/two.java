package TaskC1;

import java.util.Locale;

public class two {
    public static boolean feast(String beast, String dish) {
        boolean result = false;
        beast = beast.toLowerCase(Locale.ROOT);
        dish = dish.toLowerCase(Locale.ROOT);
        String beastLetters = "";
        String dishLetters = "";

        beastLetters = beast.charAt(0) + "" + beast.charAt(beast.length()-1);
        dishLetters = dish.charAt(0) + "" + dish.charAt(dish.length()-1);

        result = beastLetters.equals(dishLetters);
        return result;
    }
}
