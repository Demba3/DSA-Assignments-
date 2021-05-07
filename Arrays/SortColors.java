class Solution {
    public static void sortColors(int[] nums) {
        int lo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (1 > nums[i])
                swap(nums, lo++, i);
        }
        int hi = nums.length - 1;
        for (int i = lo; i <= hi; i++) {
            if (1 == nums[i]) {
                swap(nums, i, lo++);
            }
        }

    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
