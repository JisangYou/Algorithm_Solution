import java.util.Arrays;

public class SortingStr {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(n, n + 1) + strings[i];

        }

        Arrays.sort(strings);

        answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
            System.out.println(answer[i]);
        }

        return answer;
    }

//  다른 사람 풀이  Comparator를 활용함

//    Arrays.sort(strings, new Comparator<String>(){
//        @Override
//        public int compare(String s1, String s2){
//            if(s1.charAt(n) > s2.charAt(n)) return 1;
//            else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
//            else if(s1.charAt(n) < s2.charAt(n)) return -1;
//            else return 0;
//        }
//    });
//      return strings;

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        String[] strings = new String[]{"sun", "bed", "car"};
        String[] strings = new String[]{"abce", "abcd", "cdx"};
//        int n = 1;
        int n = 2;
        SortingStr sol = new SortingStr();
        sol.solution(strings, n);

    }
}
