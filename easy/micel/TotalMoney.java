// https://leetcode.com/problems/calculate-money-in-leetcode-bank

// Best
public int totalMoney(int n) {
    int q = n / 7;
    int r = n % 7;

    int sumWeeks = (28 * q) + (7 * q * (q - 1) / 2);
    int sumDays = (q * r) + (r * (r + 1) / 2);

    return sumWeeks + sumDays;
}

// Good
public int totalMoney(int n) {
    int total = 0;
    int monday = 1;

    for(int day = 0; day < n; day++) {
        int dayOfWeek = day % 7;
        total = total + (monday + dayOfWeek);
        if(dayOfWeek == 6) {
            monday++;
        }
    }

    return total;
}

// Naive
public int totalMoney(int n) {
    int money = 0;
    int cycle = n / 7;
    int left = n % 7;

    int dayBefore = 0;
    if (cycle == 0) {
        while (left != 0) {
            left--;
            dayBefore = dayBefore + 1;
            money = money + dayBefore;
        }

        return money;
    }

    dayBefore = cycle;
    money = 28;
    cycle--;
    int nextMoney = money;
    while (cycle != 0) {
        nextMoney = nextMoney + 7;
        money = money + nextMoney;
        cycle--;
    }

    while (left != 0) {
        left--;
        dayBefore = dayBefore + 1;
        money = money + dayBefore;
    }

    return money;
}
