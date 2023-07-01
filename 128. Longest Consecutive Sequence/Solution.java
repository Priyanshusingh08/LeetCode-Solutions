class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c =1;
        int m = 1;
        
        if(nums.length<1) return 0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1==nums[i+1] ){
                c++;
                m = Math.max(m,c);
            }
            
            else if(nums[i]==nums[i+1]) continue;

            else{
                c=1;
            }
        }
        return m;
    }
}