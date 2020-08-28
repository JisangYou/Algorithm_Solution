public class OddEven {
    public String solution(int num) {
//        String answer ;
//        if (Math.abs(num) % 2 == 1) answer = "Odd";
//        else answer = "Even";
//        return answer;
        String result = "";
        int val = num % 2;

        if(val == 0){
            result = "Even";
        }else if(val == 1){
            result = "Odd";
        }

        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int odd = -1;
//        int even = 4;
        OddEven sol = new OddEven();
        sol.solution(odd);

    }
}
