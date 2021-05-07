import java.util.HashMap;

class Solution {
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i))
                mp.put(i, mp.get(i) + 1);
            else
                mp.put(i, 1);
        }
        int ans = 0;
        int frq = n / k;
        for (int key : mp.keySet()) {
            if (mp.get(key) > frq) {
                ans++;
            }
        }
        return ans;
    }
}
