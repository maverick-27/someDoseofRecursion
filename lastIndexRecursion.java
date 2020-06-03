public class LastIndex {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 6};
        int last_Index_of = 1;
        int data = firstIndex(nums, 0, nums.length - 1, last_Index_of);
        System.out.println(data);
    }

    public static int firstIndex(int[] nums, int start, int end, int number) {
        if (start > end) {
            return -1;
        }
        if (nums[end] == number) {
            return end;
        }
        return firstIndex(nums, start, end - 1, number);
    }
}
