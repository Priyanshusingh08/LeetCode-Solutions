class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0; int i=0,j=0;

        HashSet<Character>  hs = new HashSet<>();

        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j++));
                max = Math.max(max,hs.size());
            }
            else{
                hs.remove(s.charAt(i++));
            }
        }
        return max;
    }
}