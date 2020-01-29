public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int result = 0;

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                result = i;
                break;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;

        SearchInsertPosition sol = new SearchInsertPosition();
        System.out.print(sol.searchInsert(nums, target));

    }
}
