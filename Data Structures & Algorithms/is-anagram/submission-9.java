class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(char i = 'a' ; i<= 'z' ; i++){
            map.put(i, 0);
        }

        for(int i = 0 ; i < s.length(); i++){
            map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            map.put(t.charAt(i) , map.get(t.charAt(i)) - 1);
        }

        for ( int i = 0 ; i < s.length(); i++){
            if (map.get(s.charAt(i)) != 0){
                return false;
            }
        }
        return true;
    }
}
