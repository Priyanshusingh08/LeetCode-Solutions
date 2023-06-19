class Solution {
    public String reversePrefix(String word, char ch) {
        
         StringBuilder s = new StringBuilder();
        int d =0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==ch){
                d=i;
                break;
            }
        }
        for(int i=0; i<=d;i++){
            s.append(word.charAt(i));
        }
        s.reverse();
        for(int i=d+1; i<word.length();i++){
           s.append(word.charAt(i));
        }

        return s.toString();
    }
}