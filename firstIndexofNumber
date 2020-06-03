public class FirstIndexRecursion {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int first_Index_Of = 1;
        int data = firstIndex(nums, 0, nums.length, first_Index_Of);
        System.out.println(data);

    }

    public static int firstIndex(int[] nums, int start, int end, int number) {
        if (start == end) {
            return -1;
        }
        if (nums[start] == number) {
            return start;
        }
        return firstIndex(nums, start + 1, end, number);
    }
}
