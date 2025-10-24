// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/count-number-pairs/problem

public static int countAffordablePairs(List<Integer> prices, int budget) {
    int count = 0;
    int left = 0;
    int right = prices.size() - 1;
    
    while(left < right) {
        int sum = prices.get(left) + prices.get(right);
        if(sum <= budget) {
            count = count + (right - left);
            left++;
        } else {
            right--;
        }
    }
    
    return count;
}
