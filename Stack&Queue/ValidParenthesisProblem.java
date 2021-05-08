import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('[') || s.charAt(i) == ('{') || s.charAt(i) == ('(')) {
                s1.push(s.charAt(i));
            }
            if (s1.isEmpty())
                return false;
            else if (s.charAt(i) == ('}')) {
                if (!s1.pop().equals('{'))
                    return false;
            } else if (s.charAt(i) == (']')) {
                if (!s1.pop().equals('['))
                    return false;
            } else if (s.charAt(i) == (')')) {
                if (!s1.pop().equals('('))
                    return false;
            }
        }
        return s1.isEmpty();
    }
}
