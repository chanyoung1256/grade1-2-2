package Week_12;

import java.io.*;

public class FileOutStreamExam
{
    public static void main(String[] args) {
        FileOutputStream fout = null;
        FileInputStream fin = null;
        byte[] data = {1,2,3,4,5,6,7,8,9,10};
        int bdata = 0;
        try
        {
            fout = new FileOutputStream("my.data");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일을 만들수 없습니다.");
        }
        try
        {
            for(int i = 0; i < data.length; i++)
            {
                fout.write(data[i]);
            }
        }
        catch (IOException ioe)
        {
            System.out.println("파일 쓰기에 실패 했습니다.");
        }
        try
        {
            fout.close();
        }
        catch (IOException ioe)
        {
            System.out.println("파일 닫기 실패 했습니다.");
        }
        catch (NullPointerException npe)
        {
            System.out.println("갹체가 생성되지 않았습니다.");
        }

        try
        {
            fin = new FileInputStream("my.data");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("파일을 찾을수 없습니다.");
        }
        try
        {
            while((bdata = fin.read()) != -1)
                System.out.println((byte)bdata);
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 읽을수 없습니다.");
        }
        try
        {
            fin.close();
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 닫는데 실패 했습니다.");
        }
    }
}
