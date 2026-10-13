class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        Set<String> operations = Set.of("+", "-", "*", "/");

        for(int i = 0; i < tokens.length; i++){
            String s = tokens[i];
            
            if(operations.contains(s)){
                int val2 = stack.pop();
                int val1 = stack.pop();
                int result = 0;

                if("+".equals(s)){
                    result =  val1 + val2;
                } else if("-".equals(s)){
                     result =  val1 - val2;
                }else if("*".equals(s)){
                     result =  val1 * val2;
                } else if("/".equals(s)){
                     result =  val1 / val2;
                }
                
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(s));
            }


        }

        return stack.pop();
        
    }
}
