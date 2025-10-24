// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/maximum-non-overlapping-intervals/problem

public class App {
    
    public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {
        int count = 0;
        if (meetings.isEmpty()) return 0;

        if (meetings.size() == 1) return 1;

        meetings.sort(Comparator.comparing(meeting -> meeting.get(1)));

        int lastEndTime = Integer.MIN_VALUE;
        for (List<Integer> meeting : meetings) {
            int start = meeting.get(0);
            int end = meeting.get(1);

            if (start >= lastEndTime) {
                count++;
                lastEndTime = end;
            }
        }

        return count;
    }
}
