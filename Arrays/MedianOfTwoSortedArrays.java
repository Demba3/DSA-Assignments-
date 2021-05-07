class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr = new int[nums1.length + nums2.length];
        int i = 0; // point at nums1
        int j = 0; // points at muns 2
        int k = 0;
        while (i < nums1.length || j < nums2.length) {
            if (i >= nums1.length) newArr[k++] = nums2[j++];// nums1 is empty
            else if (j >= nums2.length) newArr[k++] = nums1[i++]; // nums2 is empty
            else if (nums1[i] > nums2[j]) newArr[k++] = nums2[j++];
            else newArr[k++] = nums1[i++];
        }
        if (newArr.length % 2 != 0)
            return newArr[(newArr.length / 2)];
        else {
            int midleIndex = newArr.length / 2;
            double ans = (double) (newArr[midleIndex] + newArr[midleIndex - 1]) / 2;
            return ans;
        }
    }
}
