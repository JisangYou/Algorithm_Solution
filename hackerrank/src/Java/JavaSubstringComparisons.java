package Java;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }


    public static String getSmallestAndLargest(String s, int k) {
        String max = s.substring(0, k);
        String min = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - k + 1; i++) {

            if (s.substring(i, k + i).compareTo(max) > 0) {
                max = s.substring(i, k + i);

            } else if (s.substring(i, k + i).compareTo(min) < 0) {
                min = s.substring(i, k + i);

            }
        }
        return min + "\n" + max;
    }
}
