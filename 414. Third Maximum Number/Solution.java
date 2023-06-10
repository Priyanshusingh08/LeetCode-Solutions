class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();

        for(int e: nums){
            h.add(e);
        }

        if(h.size()>=3){
            h.remove(Collections.max(h));
            h.remove(Collections.max(h));
        }
       
        return Collections.max(h);
    }
}