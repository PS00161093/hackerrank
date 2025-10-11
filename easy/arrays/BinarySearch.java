// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/lookup-with-binary-search/problem

public class App {

    public static int binarySearch(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums.get(mid)) {
                return mid;
            } else if (target > nums.get(mid)) {
                left = mid + 1; // If target > nums[mid], then target cannot be at position mid, So we need to search in range [mid + 1, right)
            } else if (target < nums.get(mid)) {
                right = mid;
            }
        }
        return -1;
    }
}
