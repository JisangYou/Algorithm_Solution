import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeleteSmallNum {

    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList list = new ArrayList();
        answer = new int[arr.length - 1];
        Arrays.sort(arr);
        int min = arr[0];

        if (arr.length <= 1) {
            return new int[]{-1};
        }

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        list.remove(list.indexOf(min));
//        list.remove(min);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = (int) list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int[] intArr = new int[]{5, 4, 3, 2, 1, 0};
//        int[] intArr = new int[]{1, 1, 1, 1};
//        int[] intArr = new int[]{1};
        DeleteSmallNum sol = new DeleteSmallNum();
        sol.solution(intArr);

    }
}
