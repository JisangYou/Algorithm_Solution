import java.util.Scanner;

public class DP_exam_1 {

    static int[] fibo_memo;
    static int[] change;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
//=============================================
//        int a = sc.nextInt();
//        fibo_memo = new int[45];
//        fibo(a);
//=============================================

        change = new int[100];
        System.out.println("거스름돈을 입력해주세요:");
        int i = sc.nextInt();
        calc_change();
        System.out.println("지불해야하는 거스름돈 개수 :" + change[i]);

    }

    static void fibo(int a) {

        fibo_memo[0] = 0;
        fibo_memo[1] = 1;

        for (int i = 2; (i <= a) && (i < 45); i++) {
            fibo_memo[i] = fibo_memo[i - 2] + fibo_memo[i - 1];
        }

        System.out.println(fibo_dp(a));
    }

    static int fibo_dp(int a) {
        if (a < 45) return fibo_memo[a];
        else {
            return fibo_dp(a - 1) + fibo_dp(a - 2);
        }
    }

    static void calc_change() {
        change[0] = 0;

        for (int i = 1; i < 100; i++) {
            change[i] = min_change(i) + 1;
        }

    }

    static int min_change(int i) {
        int min = change[i - 1];
        System.out.print("change[i - 1] === " + min);
        if (i >= 3) {
            if (min > change[i - 3]) {
                min = change[i - 3];
                System.out.print("i >= 3, min === " + min);
            }
        }
        if (i >= 4) {
            if (min > change[i - 4]) {
                min = change[i - 4];
                System.out.print("i >= 4, min === " + min);
            }
        }
        return min;
    }
}
