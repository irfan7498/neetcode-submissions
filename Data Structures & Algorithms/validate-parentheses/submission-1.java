class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> valid = new HashMap<>();
        valid.put(']', '[');
        valid.put(')', '(');
        valid.put('}', '{');

        for (char w : s.toCharArray()){
            if(valid.containsKey(w)){
                if(!stack.isEmpty() && stack.peek() == valid.get(w)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(w);
            }
        }
        if(stack.isEmpty() != true){
            return false;
        }
        return true;
    }
}
