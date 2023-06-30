class Solution {
    public int dominantIndex(int[] nums) {
       
       int max =0;
       int index =0;

       for(int i=0; i<nums.length; i++){
           if(max<nums[i]){
               max=nums[i];
               index =i;
           }
       }

        Arrays.sort(nums);

        if(nums[nums.length-1]>=nums[nums.length-2]*2){
            return index;
        }

        return -1;
    }
    
       
}