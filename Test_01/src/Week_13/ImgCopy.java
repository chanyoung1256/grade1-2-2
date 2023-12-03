package Week_13;

import java.io.*;

public class ImgCopy
{
    public static void main(String[] args)
    {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int data;

        try
        {
            fin = new FileInputStream("img.png");
            fout = new FileOutputStream("Copy.png");
            while((data = fin.read()) != -1)
            {
                fout.write(data);
            }
        }
        catch(IOException ioe)
        {
            System.out.println("이미지을 열거나 복사할수 없습니다.");
        }

        try
        {
            fin.close();
            fout.close();
        }
        catch (IOException ioe)
        {
            System.out.println("이미지를 닫을수 없습니다.");
        }
    }
}
