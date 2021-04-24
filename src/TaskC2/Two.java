package TaskC2;
//Your task is to create a function that does four basic mathematical operations.
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation

public class Two {
    public static Integer basicMath(String op, int v1, int v2) {
        Integer result = 0;
        if (op.equals("-")) {
            result = v1 - v2;
        }
        else if (op.equals("+")) {
            result = v1 + v2;
        }
        else if (op.equals("*")) {
            result = v1 * v2;
        }
        else if (op.equals("/")) { if (v2 !=0) {
            result = v1 / v2;
        }
            else throw new RuntimeException("Division by 0");
        }

        return result;
    }
}
