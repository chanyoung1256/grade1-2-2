package Week_13;

import java.io.*;

public class Data_Test
{
    public static void main(String[] args)
    {
        FileOutputStream fout = null;
        FileInputStream fin = null;
        DataOutputStream dout = null;
        DataInputStream din = null;

        try
        {
            fout = new FileOutputStream("data.dat");
            dout = new DataOutputStream(fout);
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일을 만들수 없습니다.");
        }
        try
        {
            dout.writeInt(10);
            dout.writeDouble(3.14);
            dout.writeBoolean(true);
            dout.writeUTF("dataOutputSteam exam");
        }
        catch (IOException ioe)
        {
            System.out.println("오류 발생.");
        }
        try
        {
            fout.close();
            dout.close();
        }
        catch (IOException ioe)
        {
            System.out.println("닫을수 없습니다.");
        }

        try
        {
            fin = new FileInputStream("data.dat");
            din = new DataInputStream(fin);
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일을 찾을수 없습니다.");
        }
        try
        {
            System.out.println(din.readInt());
            System.out.println(din.readDouble());
            System.out.println(din.readBoolean());
            System.out.println(din.readUTF());
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 읽을수 없습니다.");
        }
        try
        {
            fin.close();
            din.close();
        }
        catch (IOException ioe)
        {
            System.out.println("데이터를 닫을수 없습니다.");
        }
    }
}
