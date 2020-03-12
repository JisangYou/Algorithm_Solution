package Java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(n);
        if (bigInteger.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }


        scanner.close();
    }
}
// BigInteger 클래스에 대해 모르고 문제를 접했을 때 아래와 같이 해결하려고 했음.
// 그러나, 계속해서 런타임에러가 나왔고, 이유를 보니 input으로 들어오는 값들이 무한대에 수렴하는 값들이여서 그랬음.

//        int p = Integer.parseInt(n);
//        int count = 0;
//
//        for (int i = 2; i <= p; i++) {
//            if (p % i == 0) {
//                count++;
//            }
//        }
//        if (count == 1) {
//            System.out.println("prime");
//        } else {
//            System.out.println("not prime");
//        }