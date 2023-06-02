import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length-1];
        int l = nums.length;
        int sum = 0;
        int sum2 = 0;
        for(int i=1; i<=l; i++){
            sum=sum+i;
        }
        for(int i=0; i<l; i++){
            sum2 = sum2+nums[i];
        }

        int res = sum-sum2;
        return res;
    }
}