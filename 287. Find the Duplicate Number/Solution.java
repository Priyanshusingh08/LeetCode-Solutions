class Solution {
    public int findDuplicate(int[] nums) {
        int a=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            else{
                map.put(nums[i],i);
            }
               
            
        }
        return 0;
    }
}