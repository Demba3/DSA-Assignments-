import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null)
                map.put(nums[i], nums[i]);
            else {
                map.put(nums[i], 0);
            }
        }
        for (int i : nums) {
            if (map.get(i) != 0) {
                return map.get(i);
            }
        }
        return -1;
    }
}
