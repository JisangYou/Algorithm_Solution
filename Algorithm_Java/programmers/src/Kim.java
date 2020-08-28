import java.util.Scanner;

public class Kim {
    public String solution(String[] seoul) {

        String answer = "";
        for (int i = 0; i <= seoul.length - 1; i++) {
            if (seoul[i] == "Kim") {
                answer = "김서방은 " + i + "에 있다";
            }
        }
//        System.out.print(answer);
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] array = new String[]{"Jane", "Kim"};

        Kim sol = new Kim();
        System.out.print(sol.solution(array));

    }
}
