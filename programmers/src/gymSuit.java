import java.util.ArrayList;

public class gymSuit {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;
        if (lost.length < reserve.length) {
            for (int i = 0; i < lost.length; i++) {
                if (reserve[i] < lost[i]) {
                    answer++;
                }
            }
        } else {
            for (int i = 0; i < reserve.length; i++) {
                if (reserve[i] > lost[i]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 5;
        int[] lost = new int[]{4,5};
        int[] reverse = new int[]{1,2,3};
        gymSuit sol = new gymSuit();
        sol.solution(n, lost, reverse);

    }
}
