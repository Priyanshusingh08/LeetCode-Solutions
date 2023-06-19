class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int res = 0;
        for(int i=0; i<gain.length; i++){
            sum+=gain[i];
            if(res<sum){
                res=sum;
            }
        }
        return res;
    }
}