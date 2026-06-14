class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> ss = new HashMap<>();
        Map<Character, Integer> str = new HashMap<>();

        int l = 0 , r = 0 ;
        for(char s : s1.toCharArray() ){
            ss.put(s, ss.getOrDefault(s, 0) + 1);
        }

        for(r = 0 ; r < s2.length(); r++){

            str.put(s2.charAt(r), str.getOrDefault(s2.charAt(r), 0) + 1);
            //if compared both hashmap equal than return true 
            if ( ss.equals(str)){
                return true;
            }
            if (((r - l) + 1) >= s1.length()){
                
                str.put(s2.charAt(l), str.get(s2.charAt(l)) - 1);
                if(str.get(s2.charAt(l)) == 0 ){
                    str.remove(s2.charAt(l));
                }
                l++;
            }
        }
        return false;
    }
}
