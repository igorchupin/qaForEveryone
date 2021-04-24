package TaskC2;

import java.util.Arrays;

public class four {
    public static String[] stringToArray(String s) {

        String [] result;
        result = s.split(" ");

        return result;
        //your code;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("safa dsaffsa fsafsaf")));
    }
}
