package Week_9;

import java.util.*;

public class gengongsik {
    public static void main(String[] args)
    {
        int a = 1;
        int b = 5;
        int c = 4;

        double x1 = 0.0;
        double x2 = 0.0;

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        x2 = (-b - Math.sqrt(Math.pow(b, 2)- 4 * a * c)) / 2 * a;

        System.out.println(x1);
        System.out.println(x2);
    }
}
