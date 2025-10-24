// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/validate-properly-nested-brackets/problem
// TC: O(n) as we iterate through the string once. And, each push and pop on the stack is O(1)
// SC: O(n) as in the worst case, the stack will store the entire string.

public class App {

    public static boolean areBracketsProperlyMatched(String code_snippet) {
        if (code_snippet == null || code_snippet.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : code_snippet.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
