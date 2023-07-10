class Solution {
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        return hcf(nums[0],nums[nums.length-1]);
    }
    public int hcf(int a,int b)
    {
        if(a==0)
            return b;
        return hcf(b%a,a);
    }
}