import java.util.ArrayList;

public class PrimeNum {
    public int solution(int num) {

        // 이 코드 파악해보기.
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[num];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        if (num == 2) {
            return 1;
        }

        for (int n = 5; n <= num; n += 2) {
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }
        System.out.println(ptr);
        return ptr;
    }


//    ArrayList arrayList = new ArrayList<Integer>();
//        arrayList.add(2);
//
//        for (int i = 2; i <= n; i++) {
//        for (int x = 0; x < arrayList.size(); x++) {
//            if (i % (int) arrayList.get(x) == 0) break;
//            if (x + 1 == arrayList.size())
//                arrayList.add(i);
//        }
//    }

    /**
     *
     * @param args
     */


    /**
     * @param args
     */
//        for (int i = 3; i <= n; i += 2) {
//        for (int x = 3; x <= i; x += 2) {
//            if (i % x == 0) {
//                cnt++;
//            }
//        }
//        if (cnt == 1) {
//            answer++;
//        }
//        cnt = 0;
//    }
//        return answer + 1;
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int n = 2;
//        int n = 5;
        PrimeNum sol = new PrimeNum();
        sol.solution(n);

    }
}
