package Week_12;
import java.io.*;
public class FileWriterExam
{
    public static void main(String[] args)
    {
        int c;
        FileWriter out = null;

        try
        {
            out = new FileWriter("Output.txt");
        }
        catch (IOException ioe)
        {
            System.out.println("파일 만드데 실패 했습니다.");
        }
        try
        {
            while((c = System.in.read()) != -1)
            {
                out.write(c);
            }
        }
        catch (IOException ioe)
        {
            System.out.println("파일 쓰는데 실패 했습니다");
        }
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println("총 소요시간 : " + (end - start) + "milliseconds");
        try
        {
            out.close();
        }
        catch (IOException ioe)
        {
            System.out.println("파일 닫는데 실패 했습니다.");
        }


    }
}
