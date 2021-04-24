package TaskC2;

//Build a function that returns an array of integers from n to 1 where n>0.
//
//Example : n=5 --> [5,4,3,2,1]

import java.util.Arrays;

public class Three {
    public static int[] reverse(int n){
       int [] result = new int[n];
        for (int i = 0 ; i < result.length; i++) {
            result[i] = n;
            n--;
        }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }


}
