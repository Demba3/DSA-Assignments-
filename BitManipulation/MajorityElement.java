class Solution {
    public int majorityElement(int[] nums) {
        // find number of bits in the integer, wwe ill use 32 for all int values.

        // use a cont to see how many elements in the array have the first bit set. Then second,            //then third to the last one.
        int count = 0;
        int answer = 0;
        int i = 0;
        while (i < 32) {

            for (int j = 0; j < nums.length; j++) {
                //check if first bit is set
                if ((nums[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            //update your answer to have this value
            if (count > (nums.length / 2)) {
                answer = answer | (1 << i);
            }
            //  System.out.println(i);
            count = 0;
            i++;
        }

        return answer;
    }
}
