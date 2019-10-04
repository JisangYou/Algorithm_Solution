import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisorArr {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(list);
        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = (int) list.get(i);
        }

        return answer;
    }


    // lambda를 이용한 다른 사람들의 풀이
    // return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); ->


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int[] arr = new int[]{5, 9, 7, 10};
        int div = 5;
        DivisorArr sol = new DivisorArr();
        sol.solution(arr, div);

    }
}
