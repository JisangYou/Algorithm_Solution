public class WaterMellon {


    public String solution(int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        String answer = sb.toString();
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int n = 3;
        WaterMellon sol = new WaterMellon();
        sol.solution(n);

    }
}
