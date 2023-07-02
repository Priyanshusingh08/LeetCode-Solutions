class Solution {
    public int differenceOfSum(int[] nums) {


        int sum = 0;
        int dsum =0;

        for( int e : nums){
            sum+=e;

            while(e>9){
                dsum+=e%10;
                e=e/10;
            }
            dsum+=e;
        }
        return sum-dsum;
        
    }
}