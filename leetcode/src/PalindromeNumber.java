public class PalindromeNumber {

    /**
     *
     * @param x
     * if (sb.equals(sb.reverse())) {
     *             return true;
     *         }
     *             return false;
     *
     *  이 로직은 같다고 나옴.
     *  sb라는 객체의 값을 비교하는 것으로 여겨짐.
     *
     * @return
     *
     */

    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = -121;
        PalindromeNumber sol = new PalindromeNumber();
        System.out.println(sol.isPalindrome(x));

    }
}
