class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String str = String.valueOf(num);
        int c=0;
        for(int i=0; i<=str.length()-k; i++){
            int n = Integer.parseInt(str.substring(i,i+k));
            if(n!=0 && num%n==0){
                c++;
            }
        }
        return c;
    }
}