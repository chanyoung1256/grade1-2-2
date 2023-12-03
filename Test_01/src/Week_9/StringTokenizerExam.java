package Week_9;

import java.util.*;

public class StringTokenizerExam {
    public static void main(String[] args)
    {
        String str = "Hello World";
        StringTokenizer stk = new StringTokenizer("http://www.hallym.ac.kr", "://.");

        while(stk.hasMoreElements())
        {
            System.out.println(stk.nextToken());
        }

        String[] strs = str.split(" ");
        for(int i = 0; i < strs.length; i++)
        {
            System.out.println(strs[i]);
        }
    }
}
