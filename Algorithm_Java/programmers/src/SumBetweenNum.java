public class SumBetweenNum {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            answer = a;
        }
        return answer;
    }

    // 다른 사람 풀이

    /*
    public long solution(int a, int b) {
        long answer = 0;
        if(a!=b){
            for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
                answer+=i;
            }
        }else{
            answer=a;
        }
        return answer;
    }
    */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 3;
        int b = 5;
        SumBetweenNum sol = new SumBetweenNum();
        sol.solution(a, b);
    }
}