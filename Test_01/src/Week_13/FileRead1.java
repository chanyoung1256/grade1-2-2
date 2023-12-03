package Week_13;

import java.io.*;
import java.util.*;

public class FileRead1
{
    public static void main(String[] args)
    {
        FileReader fr = null;
        BufferedReader br = null;
        String line;

        try
        {
            fr = new FileReader("best.txt");
            br = new BufferedReader(fr);

            while((line = br.readLine()) != null)
            {
                StringTokenizer token = new StringTokenizer(line);

                while(token.hasMoreTokens())
                {
                    String word = token.nextToken();
                    System.out.println(word);
                }
            }
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 읽을수 없습니다.");
        }
        try
        {
            fr.close();
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 닫을수 없습니다.");
        }
    }
}
