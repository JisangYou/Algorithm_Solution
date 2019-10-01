import java.util.*;

public class HateSameNum {
    public int[] solution(int[] arr) {

        // 생각보다 개인적으로 굉장히 헷갈렸음..
        // 어레이리스트 remove에 대해 착각하고 있는 부분이 있었음.

//        ArrayList<Integer> tempList = new ArrayList<Integer>();
//        int temp = -1;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (temp == arr[i]) {
//
//                continue;
//            } else {
//                tempList.add(arr[i]);
//                temp = arr[i];
//            }
//        }
//        int[] answer = new int[tempList.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = tempList.get(i);
//            System.out.println(answer[i]);
//        }
//
//
//        return answer;


        // 내가 구현하고자 했던거.
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                tempList.add(arr[i]);
            } else {
                if (arr[i-1] != arr[i]) {
                    tempList.add(arr[i]);
                }
            }
        }
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tempList.get(i);
            System.out.println(answer[i]);
        }


        return answer;
    }

    /*

       int[] answer = {};
        int size = arr.length;
        List<Integer> s = new ArrayList<Integer>();
        for(int i = 0; i < size; i++)
        {
            if(i == 0)
            {
                s.add(arr[i]);
            }
            else
            {
                if(arr[i-1] != arr[i])
                {
                    s.add(arr[i]);
                }
            }
        }



        answer = new int[s.size()];

        int i = 0;
        for(Integer n : s)
        {
            answer[i] = n;
            i++;
        }
        return answer;

    */


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int[] a = {4, 4, 4, 3, 3};
//        int[] a = {1, 1, 3, 3, 0, 1, 1};
        HateSameNum sol = new HateSameNum();
        sol.solution(a);

    }

}
