public class XintervalNnum {
    public long[] solution(int x, int n) {
        // x만큼 간격이 있는 n개의 숫자
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int x = -4;
        int n = 2;
        XintervalNnum sol = new XintervalNnum();
        sol.solution(x, n);

    }
}
