public class GcdLcm {
    public int[] solution(int n, int m) {
        int[] answer;
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        int gcd = 1;


        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        answer = new int[]{gcd,  min * max / gcd};
        return answer;
    }

    /**
     * 다른 사람들 풀이1
     * @param args
     *
     */

//    public int[] gcdlcm(int a, int b) {
//        int[] answer = new int[2];
//
//        answer[0] = gcd(a,b);
//        answer[1] = (a*b)/answer[0];
//        return answer;
//    }
//
//    public static int gcd(int p, int q)
//    {
//        if (q == 0) return p;
//        return gcd(q, p%q);
//    }
    /**
     * 다른 사람들 풀이2
     * @param args
     *
     */

//    public static int gcd (int a, int b) {
//        while (b != 0) {
//            int r = a % b;
//            a = b;
//            b = r;
//        }
//        return a;
//    }
//
//    public static int lcm(int a, int b) {
//        return a * b / gcd(a, b);
//    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int n = 5;
        int m = 5;
        GcdLcm sol = new GcdLcm();
        sol.solution(n, m);

    }
}


