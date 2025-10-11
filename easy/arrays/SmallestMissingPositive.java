// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/find-smallest-missing-positive-integer/problem?isFullScreen=true
// The key insight is to use a cyclic sort approach where we place each positive integer x (in range 1 to n) at index x-1.

public class App {

    public int findSmallestMissingPositive(List<Integer> orderNumbers) {
        // If array is empty, return 1
        if (orderNumbers == null || orderNumbers.isEmpty()) {
            return 1;
        }

        int len = orderNumbers.size();

        // Place each positive integer x (where 1 <= x <= n) at index x-1
        for (int i = 0; i < len; i++) {
            int swapCount = 0;

            // Keep swapping until the current position has the correct value or contains a value that's out of range
            while (orderNumbers.get(i) > 0
                    && orderNumbers.get(i) <= len
                    && !Objects.equals(orderNumbers.get(i), orderNumbers.get(orderNumbers.get(i) - 1))
                    && swapCount < len) {

                // Swap orderNumbers[i] with orderNumbers[orderNumbers[i] - 1]
                int temp = orderNumbers.get(orderNumbers.get(i) - 1);
                orderNumbers.set(orderNumbers.get(i) - 1, orderNumbers.get(i));
                orderNumbers.set(i, temp);
                swapCount++;
            }
        }

        // Find the first index i where orderNumbers[i] != i + 1
        for (int i = 0; i < len; i++) {
            if (orderNumbers.get(i) != i + 1) {
                return i + 1;
            }
        }

        // If all positions from 1 to n are filled correctly, return n + 1
        return len + 1;
    }
}
