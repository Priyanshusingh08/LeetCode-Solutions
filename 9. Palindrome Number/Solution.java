class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int rem;
        int sum=0;
        if(y<0){
            return false;
        }
        while(y!=0){
            rem = y%10;
            sum = sum*10+rem;
            y=y/10;
            
        }
        if (sum==x){
            return true;
        }
        else {
            return false;
        }

    }
}