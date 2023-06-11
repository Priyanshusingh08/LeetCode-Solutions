class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
          int res=0;

        if(nums.length==1){
            res=nums[0];
        }


        for(int i=1; i<nums.length-1; i++){
         if(i==1 && nums[i]!=nums[i-1]){
                res=nums[i-1];
            }
            else if(i==nums.length-2 && nums[i]!=nums[i+1]){
                res=nums[i+1];
            }
            else if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                res = nums[i];
            }
            
        }
        return res;
    }
}