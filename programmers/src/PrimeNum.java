public class PrimeNum {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            for (int x = 2; x <= i; x++) {
                if (i % x == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer++;
            }
            cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int n = 10;
//        int n = 5;
        PrimeNum sol = new PrimeNum();
        sol.solution(n);

    }
}
