package maximumgeneric;

public class FindMaximum
{
    public static void main(String args[]) {
        Integer[] intVal = { 12, 13, 9, 5 };
        Float[] floatVal = { 12.55f, 13.65f, 19.22f };
        String[] stringVal = { "Apple", "Peach", "Banana" };
        Generic.compare(intVal);
        Generic.compare(floatVal);
        Generic.compare(stringVal);
    }
}
