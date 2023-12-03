package Week_9;

public class MathExam {
    public static void main(String[] args)
    {
        int i = 9;
        int j = -5;
        int max;

        System.out.println("자연 로그값 : " + Math.log(2));
        System.out.println("절대값 : " + Math.abs(i));
        System.out.println("절대값 : " + Math.abs(j));

        System.out.println("천장값 : " + Math.ceil(-40.1));
        System.out.println("바닥값 : " + Math.floor(12.5));

        max = Math.max(10, 20);
        System.out.println(max);
        System.out.println(Math.min(10, 20));

        System.out.println("승수 구하기 : " + Math.pow(10, 2));
        System.out.println("루트값 : " + Math.sqrt(100));
        System.out.println("반올림 : " + Math.round(4.2));

        System.out.println("랜덤값 : " + (int)(Math.random() * 100)); // (int)(Math.random() * 10)
        System.out.println();

    }
}
