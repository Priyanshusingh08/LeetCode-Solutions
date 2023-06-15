class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null) return false;

        if(s.length()!=t.length()) return false;

        int[] a = new int[26];

        for(int i=0; i<s.length(); i++){
            a[s.charAt(i)-'a']++;
              a[t.charAt(i)-'a']--;
            
        }
        for (int e : a){
            if(e!=0) return false;
        }
          return true;
    }
}