// Задача 1

// Code as fast as you can! You need to double the integer and return it.

class Java {
    public static int doubleInteger(int i) {
        // Double the integer and return it!
        i = i * 2;
        return i;
    }
}

//_____________________________________________________________________________________________________________________
//Задача 2

//Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
// If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
//Write a function that will take the number of petals of each flower and return true if they
// are in love and false if they aren't.

class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        boolean result= false;
        if ((flower1 + flower2) %2 !=0 ) {result = true;}
        return result;
    }
}

//_____________________________________________________________________________________________________________________

//Задача 3

// We need a function that can transform a number into a string.
//What ways of achieving this do you know?

class Kata2 {
    public static String numberToString(int num) {

        String result = Integer.toString(num);
        return result;
    }
}

//_____________________________________________________________________________________________________________________
//Задача 4

//Given an array of integers your solution should find the smallest integer.
//For example:
//Given [34, 15, 88, 2] your solution will return 2
//Given [34, -345, -1, 100] your solution will return -345
//You can assume, for the purpose of this kata, that the supplied array will not be empty.

class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++) {
            if (args[i] < result) {
                result = args[i];
            }
        }
    return result;
    }
}


//_____________________________________________________________________________________________________________________
//Задача 5

//If you can't sleep, just count sheep!!
//Task:
//Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
// Input will always be valid, i.e. no negative integers.

class Kata3 {
    public static String countingSheep(int num) {
        String result ="";
        //Add your code here
        for (int i = 1; i <= num; i++) {
            result = result + i +" sheep..."; }

        return result;
    }
}




