public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;


        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i]) {
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }

            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - reserve[j] == 1 || lost[i] - reserve[j] == -1) {
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 10;
        int[] lost = new int[]{1, 2, 3};
        int[] reverse = new int[]{1, 2, 3};
        GymSuit sol = new GymSuit();
        sol.solution(n, lost, reverse);

    }
}
