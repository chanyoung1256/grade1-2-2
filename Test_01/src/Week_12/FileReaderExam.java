package Week_12;

import java.io.*;

public class FileReaderExam
{
    public static void main(String[] args)
    {
        int c;
        FileReader in = null;
        try
        {
            in = new FileReader("Input.txt");
        }
        catch (IOException ioe)
        {
            System.out.println("파일 찾는데 실패 했습니다.");
        }
        try
        {
            while((c = in.read()) != -1)
            {
                System.out.print((char)c);
            }
        }
        catch (IOException ioe)
        {
            System.out.println("파일 읽기 실패 했습니다.");
        }
        try
        {
            in.close();
        }
        catch (IOException ioe)
        {
            System.out.println("파일 닫는데 실패 했습니다.");
        }
    }
}
