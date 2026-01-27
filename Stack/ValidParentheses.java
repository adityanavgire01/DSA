// Classic stack problem
// String valid only if the "open" bracket is adjacent to closed bracket
// Order matters
// valid: { [ ] }
// invalid: { [ } ]

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[]}";
        Deque<Character> stack = new ArrayDeque<>();
        boolean isValid = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }

                char top = stack.peek();

                if (c == ')' && top == '(') {
                    stack.pop();
                } else if (c == '}' && top == '{') {
                    stack.pop();
                } else {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("String is valid: " + str);
        } else {
            System.out.println("Invalid String..");
        }

    }
}