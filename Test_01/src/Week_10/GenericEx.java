package Week_10;

public class GenericEx {
    public static void main(String[] args) {
        String[] starr = {"Kim", "lee", "park"};
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ArrayPrint.<Integer>getFirst(arr));
    }
}
