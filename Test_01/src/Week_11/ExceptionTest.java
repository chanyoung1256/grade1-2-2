package Week_11;

import java.util.*;

public class ExceptionTest
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(Class.forName("java.lang.Object"));
        }
        catch (ClassNotFoundException cf)
        {
            System.out.println("해당 클래스는 존재하지 않습니다.");
        }
    }
}
