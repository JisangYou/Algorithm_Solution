import java.util.*;

public class StrDescend {
    public String solution(String s) {
        char[] charArr = s.toCharArray();

        Arrays.sort(charArr);
        List list = new ArrayList();
        for (int i = charArr.length - 1; i > -1; i--) {
            list.add(charArr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String qwer = "Zbcdefg";
        StrDescend sol = new StrDescend();
        sol.solution(qwer);

    }
}
