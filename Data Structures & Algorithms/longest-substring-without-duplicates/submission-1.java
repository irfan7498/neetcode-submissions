class Solution {
    public int lengthOfLongestSubstring(String s) {
         int l = 0 ;
         Set<Character> inWin = new HashSet<>();
         int res = 0 ;
         char[] str = s.toCharArray();
         for(int r = 0 ; r< s.length(); r++){
            while (inWin.contains(str[r])){
                inWin.remove(str[l]);
                l++;
            }
          inWin.add(str[r]);
          res = Math.max(res, r - l + 1) ; 
         }
        return res;
    }
}
