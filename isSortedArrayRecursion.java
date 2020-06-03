public class IsSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 8, 2};
        boolean flag = isSorted(nums, 0, nums.length - 1);
        System.out.println(flag);
    }

    public static boolean isSorted(int[] nums, int start, int end) {
        if (start == end) {
            return true;
        }
        return nums[start] < nums[start + 1] && isSorted(nums, start + 1, end);
    }


}
