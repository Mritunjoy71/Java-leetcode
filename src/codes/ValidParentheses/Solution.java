package codes.ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[')
                stack.push(chars[i]);
            else if (stack.isEmpty())
                return false;
            else if (chars[i] == ')' && stack.pop() != '(')
                return false;
            else if (chars[i] == '}' && stack.pop() != '{')
                return false;
            else if (chars[i] == ']' && stack.pop() != '[')
                return false;

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String input = "(){}[]";
        Solution solution = new Solution();
        System.out.println("Result: " + solution.isValid(input));
    }

}



