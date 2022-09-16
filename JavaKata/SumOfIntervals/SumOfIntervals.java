package JavaKata.SumOfIntervals;

import java.util.*;

public class SumOfIntervals {
    public static int sumIntervals(int[][] intervals) {
        int sum = 0, length = intervals.length;

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        for (int i = 0; i < length; ++i) {
            sum += intervals[i][1] - intervals[i][0];
            if ((i < length - 1) && (intervals[i + 1][0] < intervals[i][1])) {
                intervals[i + 1][0] = intervals[i][1];
                if (intervals[i + 1][0] > intervals[i + 1][1]) {
                    intervals[i + 1][1] = intervals[i + 1][0];
                }
            }
        }
        return sum;
    }

    public static void printArray(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        for (int i = 0; i < intervals.length; ++i) {
            System.out.println("[" + intervals[i][0] + ", " + intervals[i][1] + "]");
        }
    }

    public static void main(String[] args) {
        printArray(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}});
        System.out.println(sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
    }
}
