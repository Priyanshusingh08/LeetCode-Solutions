class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        for (int e : nums){
            if(nums[0]!=e && nums[nums.length-1]!=e)
            return e;
        }
        return -1;
    }
}