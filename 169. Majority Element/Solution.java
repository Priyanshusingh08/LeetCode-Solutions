class Solution {
    public int majorityElement(int[] nums) {
        int c=0;

        int r=0;
        int ind =0;

        for(int i=0; i<nums.length-1; i++){
            c=0;
            for(int j=i+1; j<nums.length; j++ ){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>r){
                r=c;
                ind=i;
            }
        }
        int res=nums[ind];
        return res;

    }
}