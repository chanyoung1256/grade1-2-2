package Week_12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy
{
    public static void copy(String str1, String str2)
    {
        int c = -1;
        FileReader fr = null;
        FileWriter fw = null;

        try
        {
            fr = new FileReader(str1);
            fw = new FileWriter(str2);
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일을 복사하고자 하는 원본 파일이 존재 하지 않습니다.");
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 열거나 생성할 수 없습니다.");
        }
        while(true)
        {
            try
            {
                if((c =fr.read()) == -1)
                    break;
                fw.write(c);
            }
            catch (IOException ioe)
            {
                System.out.println("파일을 읽거나 쓰는데 오루가 발생했습니다.");
            }
        }
        try
        {
            fr.close();
            fw.close();
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 닫을수 없습니다.");
        }
    }
}
