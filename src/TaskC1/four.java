package TaskC1;
//When provided with a letter, return its position in the alphabet.
//
//Input :: "a"
//
//Ouput :: "Position of alphabet: 1"

public class four {
    public static String position(char alphabet) {
        String result ="Position of alphabet: ";
        Character temp = alphabet;

        if (temp.hashCode() < 91) {
            result = result + (temp.hashCode() - 64);
        }
        else if (temp.hashCode() > 91) {
            result = result + (temp.hashCode() - 96);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(position('d'));
    }



}
