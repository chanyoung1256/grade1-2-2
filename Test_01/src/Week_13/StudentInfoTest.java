package Week_13;

import java.io.*;
import java.util.*;

class StudentInfo implements Serializable
{
    String name;
    int age;
    int grade;
    float score;
    public StudentInfo(String name, int age, int grade, float score)
    {
        super();
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "이름 : " + name + "\n" + "나이 : " + age + "\n" + "학년 : " + grade + "\n" + "학점 : " + score;
    }
}

public class StudentInfoTest
{
    public static void main(String[] args)
    {
        StudentInfo s = new StudentInfo("김찬영", 22, 1, 4.5f);
        String name;
        int age;
        int grade;
        float score;

        ObjectOutputStream Oout = null;
        ObjectInputStream Oin = null;
        FileOutputStream fout = null;
        FileInputStream fin = null;

        try
        {
            fout = new FileOutputStream("Objectdata.dta");
            Oout = new ObjectOutputStream(fout);
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일을 만들 수 없습니다.");
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 만들기 실패");
        }

        try
        {
            Oout.writeObject(s);
        }
        catch (IOException ioe)
        {
            System.out.println("오브젝트를 작성할 수 없습니다.");
        }

        try
        {
            fout.close();
            Oout.close();
        }
        catch (IOException ioe)
        {
            System.out.println("오브젝트를 닫을 수 없습니다.");
        }

        try
        {
            fin = new FileInputStream("Objectdata.dta");
            Oin = new ObjectInputStream(fin);
        }
        catch (IOException ioe)
        {
            System.out.println("데이터가 없습니다.");
        }
        try
        {
            System.out.println((StudentInfo)Oin.readObject());
        }
        catch (ClassNotFoundException clf)
        {
            System.out.println("데이터를 읽을수 없습니다");
        }
        catch (IOException ioe)
        {
            System.out.println("데이터를 읽을수 없습니다.");
        }
        try
        {
            fin.close();
            Oin.close();
        }
        catch (IOException ioe)
        {
            System.out.println("데이터를 닫을수 없습니다.");
        }
    }
}
