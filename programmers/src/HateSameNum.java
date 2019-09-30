import java.util.*;

public class HateSameNum {
    public int[] solution(int[] arr) {

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }


        for (int x = 0; x < arrayList.size() - 1; x++) {
            if (arrayList.get(x) == arrayList.get(x + 1)) {
                arrayList.remove(x);
            }
        }
        System.out.println(arrayList.size());
        int[] answer = new int[arrayList.size()];
        for (int y = 0; y < arrayList.size(); y++) {
            answer[y]= (int) arrayList.get(y);
            System.out.println(answer[y]);
        }

        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int[] arr = new int[]{4, 4, 4, 3, 3};
        HateSameNum sol = new HateSameNum();
        sol.solution(arr);

    }
}
