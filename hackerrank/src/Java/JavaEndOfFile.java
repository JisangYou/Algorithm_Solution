package Java;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            count++;
            System.out.println(count + " " + word);
        }
    }
}
