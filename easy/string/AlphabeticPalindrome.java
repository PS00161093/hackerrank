// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-palindrome-filter-non-letters/problem

public class App {
    public static boolean isAlphabeticPalindrome(String code) {
        if (code == null || code.trim().isEmpty()) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : code.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String filtered = sb.toString();
        int left = 0;
        int right = filtered.length() - 1;

        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
