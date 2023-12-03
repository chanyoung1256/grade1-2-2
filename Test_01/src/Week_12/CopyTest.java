package Week_12;

import java.io.*;
import java.util.*;

public class CopyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soureFile = null;
        String targetFile = null;

        System.out.println("복사할 파일명을 입력하세요. ");
        soureFile = sc.next();
        System.out.println("복사할 대상 파일명을 입력하세요. ");
        targetFile = sc.next();

        FileCopy.copy(soureFile, targetFile);
        System.out.println("복사가 완료 되었습니다.");
    }
}
