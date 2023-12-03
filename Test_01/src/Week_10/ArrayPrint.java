package Week_10;

public class ArrayPrint {
    public static <T> T getFirst(T[] arr)
    {
        return arr[0];
    }
    public static <T> T getLast(T[] arr)
    {
        return arr[arr.length - 1];
    }
    public static <T> T getMiddle(T[] arr)
    {
        return arr[arr.length / 2];
    }
}
