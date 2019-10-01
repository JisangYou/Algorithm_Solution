public class FactorSum {
    // 약수를 구하는 예제
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        int test = 12;
        int test2 = 5;
        FactorSum sol = new FactorSum();
        sol.solution(test2);

    }
}
