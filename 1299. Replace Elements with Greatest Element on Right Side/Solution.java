class Solution {
    public int[] replaceElements(int[] arr) {
        
       var max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            var tmp = arr[i];
            arr[i] = max;
            if (tmp > max) {
                max = tmp;
            }
        }
        return arr;
        
    }
}