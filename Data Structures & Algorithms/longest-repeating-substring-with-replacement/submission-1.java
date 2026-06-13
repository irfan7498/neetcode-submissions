class Solution {
    public int characterReplacement(String s, int k) {

    Map<Character, Integer> count = new HashMap<>();
     int l=0,r ;
     int res=0,maxf= 0;

    char[] str = s.toCharArray();
     for (r= 0 ; r < s.length(); r++){

        count.put(str[r], count.getOrDefault(str[r], 0) + 1);
        maxf = Math.max(count.get(str[r]), maxf);

        while( ((r - l + 1) -  maxf) > k){
            count.put(str[l], count.get(str[l])-1);
            l++;
        }
        res = Math.max(res, r - l + 1);
     }
    return res;
    }
}
