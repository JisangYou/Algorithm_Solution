public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s.trim().length() == 0) {
            return 0;
        }
        String[] str = s.trim().split(" ");
        return str[str.length - 1].length();

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "Hello World";
//        String s = "           ";

        LengthOfLastWord sol = new LengthOfLastWord();
        System.out.print(sol.lengthOfLastWord(s));

    }
}
