import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long findMinDiff(ArrayList<Long> a, long n, long m) {
        Collections.sort(a);

        long ans = Integer.MAX_VALUE;
        long currMin = 0;

        for (long i = 0; i < n - m + 1; i++) {
            currMin = a.get((int) (m - 1 + i)) - a.get((int) i);

            if (currMin < ans) {
                ans = currMin;
            }
        }
        return ans;
        // your code here
    }
}
