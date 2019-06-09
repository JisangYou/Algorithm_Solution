public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);

        System.out.println(a1.add(b1));
        System.out.println(a1.multiply(b1));


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}