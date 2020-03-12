package Java;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length() + "");
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String cap_A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cap_B = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.print(cap_A + " " + cap_B);
    }
}
