class Solution {
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            String s = words[i].toLowerCase();
            if(s.matches("[qwertyuiop]*") || s.matches("[asdfghjkl]*") || s.matches("[zxcvbnm]*")){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}