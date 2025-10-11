// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/first-occurrence-in-event-code-log/problem

public class App {

    public static int findFirstOccurrence(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (left < nums.size() && nums.get(left) == target) {
            return left;
        }

        return -1;
    }
}
