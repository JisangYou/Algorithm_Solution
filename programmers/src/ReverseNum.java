public class ReverseNum {
    public int[] solution(long n) {
        // 이문제.... n = 10000000000 일떄는 어쩌해야 될지..???

        int[] answer = {};
        String temp = String.valueOf(n);
        String[] strArr = temp.split("");

        answer = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[strArr.length - 1 - i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        long n = 1345012301;
        ReverseNum sol = new ReverseNum();
        sol.solution(n);

    }
}
