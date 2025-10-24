// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/min-tracking-stack/problem

public class App {

    public static List<Integer> processCouponStackOperations(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        for (String s : operations) {
            String[] arr = s.split(" ");
            String op = arr[0];
            if ("push".equals(op)) {
                int num = Integer.parseInt(arr[1]);
                stack.push(num);

                if (minStack.isEmpty() || minStack.peek() >= num) {
                    minStack.push(num);
                }
            } else if ("pop".equals(op)) {
                if (!stack.isEmpty()) {
                    int val = stack.pop();
                    if (val == minStack.peek()) {
                        minStack.pop();
                    }
                }
            } else if ("top".equals(op)) {
                if (!stack.isEmpty()) {
                    res.add(stack.peek());
                }
            } else if ("getMin".equals(op)) {
                if (!minStack.isEmpty()) {
                    res.add(minStack.peek());
                }
            }
        }
        return res;
    }
}
