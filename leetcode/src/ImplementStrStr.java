public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        int result = 0;


        if (haystack.contains(needle)) {
//            System.out.println(haystack.indexOf(needle));
            result = haystack.indexOf(needle);
        } else {
            result = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        String haystack = "mississippi";
//        String needle = "issip";
        String haystack = "a";
        String needle = "";
        ImplementStrStr sol = new ImplementStrStr();
        System.out.print(sol.strStr(haystack, needle));

    }
}


