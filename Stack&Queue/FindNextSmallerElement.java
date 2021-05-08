import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        int[] array = {4, 8, 5, 2, 25};
        for (int x : nextSmallerElement(array)) {
            System.out.print(x + ",");
        }
    }

    public static int[] nextSmallerElement(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> s1 = new Stack<>();
        s1.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (arr[s1.peek()] > arr[i]) {
                ans[s1.pop()] = arr[i];
                if (s1.isEmpty()) break;
            }
            s1.push(i);
        }
        return ans;
    }
}
