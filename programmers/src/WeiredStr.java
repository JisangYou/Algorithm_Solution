import java.util.ArrayList;
import java.util.Arrays;

public class WeiredStr {
    public String solution(String s) {
        String answer = "";

        String[] s_arr = s.split(" ");
        ArrayList arrayList;

        for (int i = 0; i < s_arr.length; i++) {
//            System.out.println(s_arr[i].toCharArray());
            char[] chars = s_arr[i].toCharArray();
            for (int x = 0; x < chars.length; x++) {
                System.out.println(chars[x]);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String s = "try hello world";
        WeiredStr sol = new WeiredStr();
        sol.solution(s);

    }
}
