package Week_9;

import java.util.*;

public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer sk1 = new StringTokenizer("www.hallym.co.kr", ".");
        while(sk1.hasMoreElements())
            System.out.println(sk1.nextToken());
    }
}
