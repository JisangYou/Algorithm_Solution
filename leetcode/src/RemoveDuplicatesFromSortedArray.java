import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int index = 0;

        Set set = new LinkedHashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            nums[index++] = iter.next();
        }

//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(nums[i]);
//        }
        return index;

        /**
         * 다른 사람의 풀이
         */

//        if (nums.length == 0) return 0;
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[j] != nums[i]) {
//                i++;
//                nums[i] = nums[j];
//            }
//        }
//        return i + 1;

    }

    public static void main(String[] args) {
        //TODO 추후에 다시 한번 확인 해볼 문제.

        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesFromSortedArray sol = new RemoveDuplicatesFromSortedArray();
        sol.removeDuplicates(input);
    }
}
