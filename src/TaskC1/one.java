package TaskC1;
//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.
//It should look like this:
//Sam Harris => S.H
//Patrick Feeney => P.F


import java.util.Locale;

public class one {
    public static String abbrevName(String name) {
        name = name.toUpperCase(Locale.ROOT);
        String result = "";
        result = name.charAt(0) + ".";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                result = result + name.charAt(i +1);
            }
        }
        name = result;
        return name;
    }

}
