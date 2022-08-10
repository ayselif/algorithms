import java.util.Stack;

public class BalancedStringAlgorithm {
    public boolean isBalanced(String word) {
        Stack<Character> expectedChars = new Stack<Character>();
        for (int i = 0; i < word.length(); i++) {
            char targetChar = word.charAt(i);

            if (targetChar == '(') {
                expectedChars.push(')');
            } else if (!expectedChars.isEmpty() && expectedChars.peek() == targetChar) {
                expectedChars.pop();
            } else if(targetChar == ')') {
                expectedChars.push(targetChar);
            }
        }
        return expectedChars.isEmpty();
    }
}