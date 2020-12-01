class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length(); i++){
            char car = s.charAt(i);
            if(car == '[' || car ==  '{' || car =='(' ){
                stack.push(car);
            } else if(car == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }else if(car == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            }
            else if(car == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}