package maximumgeneric;

public class Generic
{
  static <E extends Comparable<E>>
    void compare(E[] arrayValue) {

        E max = arrayValue[0];

        for (int i = 1; i < arrayValue.length; i++) {

            int result = max.compareTo(arrayValue[i]);

            if(result < 0) {
                max = arrayValue[i];
            }
        }
        printMax(max);
    }

    public static <E> void printMax(E max) {
        System.out.println("Amongst the three the maximum is " + max);
    }
}

