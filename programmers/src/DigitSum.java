public class DigitSum {
    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n);
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }


        return answer;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int N = 123;
        DigitSum sol = new DigitSum();
        sol.solution(N);

    }
}
