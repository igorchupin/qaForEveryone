//Задача 1
//Write a function which converts the input string to uppercase.

import java.util.Locale;

class Upper{
    public static String MakeUpperCase(String str){
        str = str.toUpperCase(Locale.ROOT);

        return str;
    }
}

//____________________________________________________________________________________________________________________

//Задача 2
//It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
// You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

class RemoveChars {
    public static String remove(String str) {
        String result ="";
        for (int i = 1; i < str.length()-1; i++) {
            result = result + Character.toString(str.charAt(i));}

        return result;
        }
        // your code here
    }


//____________________________________________________________________________________________________________________

//Задача 3
//Simple, remove the spaces from the string, then return the resultant string.

class Kata {
    static String noSpace(final String x) {
        String x1 = new String(x.replace(" ", ""));
    return x1;
    }
}

//____________________________________________________________________________________________________________________

//Задача 4

//You're writing code to control your town's traffic lights.
//You need a function to handle each change from green, to yellow, to red, and then to green again.
//Complete the function that takes a string as an argument representing the current state of the light
//and returns a string representing the state the light should change to.
//For example, update_light('green') should return 'yellow'.


class TrafficLights {

    public static String updateLight(String current) {
        String result = "";

        if (current.equals("green")) {result = "yellow";}
        else if (current.equals("red")) {result = "green";}
        else {result = "red";}

        return result;
    }
}

//____________________________________________________________________________________________________________________

//Задача 5

//Write a function called repeat_string which repeats the given string str exactly count times.

class Solution {
    public static String repeatStr(final int repeat, final String string) {

        String result = "";

        for (int i = 1; i <=repeat ; i++) {
            result = result + string;}
        return "";
    }
}

//____________________________________________________________________________________________________________________
























public class TaskA {
}
