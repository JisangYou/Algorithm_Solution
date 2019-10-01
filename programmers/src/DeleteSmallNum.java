import java.util.Arrays;

public class DeleteSmallNum {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        if (arr.length == 1) {
            return new int[]{-1};
        }

//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                answer[i] = arr[i];
                System.out.println(answer[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int[] intArr = new int[]{5,4, 3, 2, 1,0,-5};
        DeleteSmallNum sol = new DeleteSmallNum();
        sol.solution(intArr);

    }
}
