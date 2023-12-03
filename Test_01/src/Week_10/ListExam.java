package Week_10;

import java.util.*;

public class ListExam {
    public static void main(String[] args)
    {
        List<String> lst = Arrays.asList(new String[10]);
        lst.set(0, "kim");
        lst.set(1, "lee");
        lst.set(2, "park");

        for(int i = 0; i < lst.size(); i++)
        {
            System.out.println(lst.get(i));
        }


    }
}
