class Solution {
    public boolean isValid(String s) {

        Stack<Character> storage = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                storage.push(c);
            } else {
                
                if(storage.isEmpty() || storage.peek() == null){
                    return false;
                }

                char pop = storage.pop();

                if(pop == '(' && c == ')' ||
                 pop == '{' && c == '}' ||
                 pop == '[' && c == ']'){
                    continue;
                 } else {
                    return false;
                 }

            }
            
        }
        
        return storage.isEmpty() ? true : false;
    }
}
