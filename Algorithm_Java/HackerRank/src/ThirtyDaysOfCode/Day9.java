package ThirtyDaysOfCode;

import java.util.Scanner;

public class Day9 {
    static int factorial(int n) {
        // Complete this function
        if (n <= 1)
            return n;
        else
            return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
