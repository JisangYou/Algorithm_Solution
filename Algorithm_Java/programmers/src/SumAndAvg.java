public class SumAndAvg {
    public double solution(int[] arr) {
        double answer = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }


        return answer / n;
//        return (int) Arrays.stream(array).average().orElse(0); 다른 사람 풀이.
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int[] a = {1, 2, 3, 4};
        SumAndAvg sol = new SumAndAvg();
        sol.solution(a);

    }
}
