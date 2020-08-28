import java.util.Stack;

public class TargetNumber {
    public int[] number_arr;
    public int[] plus_minus;
    int targetNum;
    int count = 0;

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 1, 1, 1, 1};
        int target = 3;

        TargetNumber sol = new TargetNumber();
        System.out.print("sol = " + sol.solution(numbers, target));

    }

    public int solution(int[] numbers, int target) {
        plus_minus = new int[]{0, 1};
        number_arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            number_arr[i] = numbers[i];
        }
        targetNum = target;
        dfs(0, 0);

        return count;
    }

    private void dfs(int depth, int total) {

        if (depth == number_arr.length) {
            if (total == targetNum) {
                count++;
            }
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (plus_minus[i] > 0) {
                dfs(depth + 1, total + number_arr[depth]);
                System.out.println(i+", "+plus_minus[i]);
                plus_minus[i]++;
            } else {
                dfs(depth + 1, total - number_arr[depth]);
                System.out.println(i+", "+plus_minus[i]);
                plus_minus[i]--;
            }
        }
    }
}
