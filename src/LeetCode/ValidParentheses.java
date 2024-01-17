package LeetCode;

import java.util.Hashtable;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "(){}}{";
        System.out.println(isValid(str));
    }

    static boolean isValid(String s) {
        Hashtable<Character, Character> pair = new Hashtable<>();
        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');
        Stack<Character> box = new Stack<>();
        if(pair.containsKey(s.charAt(0))){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                box.push(s.charAt(i));
            }else{
                if(box.isEmpty()){
                    return false;
                }
                if(pair.get(s.charAt(i)) == box.peek()){
                    box.pop();
                }else{
                    return false;
                }
            }
        }

        return box.isEmpty();
        }
}