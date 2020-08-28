package Java;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    private static boolean flag = true;

    static {
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main
}//end of class


// 생성자를 호출하면 생성자가 호출되기 직전에 초기화 블럭이 호출된다.
