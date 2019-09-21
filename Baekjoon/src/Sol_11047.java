import java.util.Scanner;

public class Sol_11047 {
    /**
     * greedy
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int totalCount = 0;
        int n = sc.nextInt();
        int money = sc.nextInt();
        int a[] = new int[n];

        for (i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }

        for (i = n - 1; i > 0; i--) {
            totalCount += money / a[i];
            System.out.println("i == " + i);
            System.out.println("a[i] == " + a[i]);
            System.out.println("current money  == " + money);
            System.out.println("totalCount  == " + totalCount);
            money %= a[i];
            System.out.println(" money == " + money);
            System.out.println(" ===================== ");
        }
        System.out.println(totalCount);
        sc.close();
    }
}
