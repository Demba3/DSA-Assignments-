class Solution {
    public int findKthLargest(int[] nums, int k) {
        int lo = 0;
        int hi = nums.length - 1;
        int p = nums.length - k;
        while (lo < hi) {
            int j = partition(nums, lo, hi);
            if (j > p) hi = j - 1;
            else if (j < p) lo = j + 1;
            else return nums[p];
        }
        return nums[p];

    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static int partition(int[] array, int lo, int hi) {
        int size = array.length - 1;
        int i = lo + 1;
        int j = hi;
        int p = lo;

        while (true) {

            while (array[p] >= array[i]) {
                if (i == hi) break;
                i++;

            }
            while (array[p] < array[j]) {
                j--;
            }
            if (i >= j) break;
            swap(array, i, j);


        }
        swap(array, p, j);
        return j;

    }
}
