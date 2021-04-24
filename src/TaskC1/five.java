package TaskC1;

//I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements.
// I'll appreciate for your help.
//
//P.S. Each array includes only integer numbers. Output is a number too.

public class five {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            result = result + arr1 [i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result = result + arr2[i];
        }

        // arr1 + arr2 is not working...
        return result;
    }



}
