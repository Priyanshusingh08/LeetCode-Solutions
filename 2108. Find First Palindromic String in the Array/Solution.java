class Solution {
    public String firstPalindrome(String[] words) {
        String c="";
        String s="";
        for(int i=0; i<words.length; i++){
             s = words[i];
            c="";
            for(int j=s.length()-1; j>=0; j--){
                c=c+s.charAt(j);
            }
            System.out.println(c);

            if(s.equals(c)){
                break;
            }
            else{
                c="";
            }
            
        }
        return c;
    }
}