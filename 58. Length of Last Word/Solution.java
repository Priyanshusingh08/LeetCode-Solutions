class Solution {
    public int lengthOfLastWord(String s) {
        String a[] = s.split(" ");

        String g = a[a.length-1];
        return g.length();
    }
}