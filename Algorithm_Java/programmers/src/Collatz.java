public class Collatz {
    // 콜라츠 추측
    public int solution(int num) {
        int count = 0;
        return recursion(num, count);
    }

    public int recursion(long tempNum, int count) {

        // int n = 626331일 때, tempNum이 integer 범위를 넘어감.. 그러므로, long 으로 바꿈.

        if (tempNum == 1) {
            return count < 500 ? count : -1;
        }

        if (tempNum % 2 == 0) {
            count++;
            return recursion(tempNum / 2, count);
        } else {
            count++;
            return recursion((tempNum * 3) + 1, count);
        }
    }

    // 다른 사람 풀이
//    public int collatz(int num) {
//        long n = (long)num;
//        for(int i =0; i<500; i++){
//            if(n==1) return i;
//            n = (n%2==0) ? n/2 : n*3+1;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        int n = 6;
//        int n = 16;
        int n = 626331;
        Collatz sol = new Collatz();
        sol.solution(n);

    }
}
