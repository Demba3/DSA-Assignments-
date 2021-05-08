import java.util.Stack;

class Solution {
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] ans = new long[arr.length];
        Stack<Integer> s1 = new Stack<>();
        s1.push(0);
        for (int i = 1; i < n; i++) {
            while (arr[s1.peek()] < arr[i]) {
                ans[s1.pop()] = arr[i];
                if (s1.isEmpty()) break;
            }
            s1.push(i);
        }
        for (int i : s1) {
            ans[i] = -1;
        }
        // Your code here
        return ans;
    }
}
