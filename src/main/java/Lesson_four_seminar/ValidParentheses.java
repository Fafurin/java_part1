package Lesson_four_seminar;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curCh = s.charAt(i);
            if (map.containsKey(curCh)) {
                stack.push(curCh);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (map.get(stack.peek()) != curCh) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
