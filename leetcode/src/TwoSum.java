public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }


        return result;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum sol = new TwoSum();
        sol.twoSum(arr, target);

    }
}
