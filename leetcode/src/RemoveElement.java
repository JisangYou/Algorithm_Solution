public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int temp = 0;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[temp] = nums[i];
                temp++;
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        //TODO 추후에 다시 한번 확인 해볼 문제.

        int[] input = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement sol = new RemoveElement();
        sol.removeElement(input, val);
    }
}
