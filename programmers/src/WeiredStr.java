

public class WeiredStr {
    public String solution(String s) {
        String[] s_arr = s.split("");
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s_arr.length; i++) {
            if (!s_arr[i].equals(" ")) {
                if (count == 0 || count % 2 == 0) {
                    sb.append(s_arr[i].toUpperCase());
                    count++;
                } else {
                    sb.append(s_arr[i].toLowerCase());
                    count++;
                }
            } else {
                sb.append(s_arr[i]);
                count = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String s = " try hello world ";
        WeiredStr sol = new WeiredStr();
        sol.solution(s);

    }
}
