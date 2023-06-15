class Solution {
    public String reverseWords(String s) {
        String s2[] = s.split("\\s+");
        String s1 = "";
        for(int i=s2.length-1; i>=0; i--){
            s1=s1+" "+s2[i];
        }
        s1=s1.trim();
        System.out.println(s1);
        return s1;
    }
}