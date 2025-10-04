import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    private final List<Character> leftBrackets = Arrays.asList('(', '{', '[');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', ']');

    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()){
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                var top = stack.pop();
                if (bracketMatch(top, ch))
                    return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketMatch(char left, char right) {
        return leftBrackets.indexOf(left) != rightBrackets.indexOf(right);
    }

    public static void main() {
        ValidParentheses vaildParentheses = new ValidParentheses();

        String s1 = "()";
        System.out.println(vaildParentheses.isValid(s1));

        String s2 = "()[]{}";
        System.out.println(vaildParentheses.isValid(s2));

        String s3 = "(]";
        System.out.println(vaildParentheses.isValid(s3));

        String s4 = "([])";
        System.out.println(vaildParentheses.isValid(s4));

        String s5 = "([)]";
        System.out.println(vaildParentheses.isValid(s5));
    }
}
