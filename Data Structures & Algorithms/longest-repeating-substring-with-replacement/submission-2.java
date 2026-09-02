class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0 ;
        int l = 0 ;
        Map<Character,Integer> count = new HashMap<>();

        for(int r=0; r < s.length() ; r++){
            count.put(s.charAt(r),  count.getOrDefault(s.charAt(r), 0)+1);
            int max = Collections.max(count.values());

            while((r-l+1)- max > k){
                count.put(s.charAt(l), count.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(r-l+1, res);
        }
        return res;
    }
}