public class SquareRoot {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        int compareNum = (int) num;

        if (num != compareNum) {
            answer = -1;
        } else {
            answer = (long) Math.pow(num + 1, 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        int n = 121;
        long n = 1;
        SquareRoot sol = new SquareRoot();
        sol.solution(n);

    }
}
