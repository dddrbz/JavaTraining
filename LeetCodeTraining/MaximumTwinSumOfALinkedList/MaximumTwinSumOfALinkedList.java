package LeetCodeTraining.MaximumTwinSumOfALinkedList;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class Solution {

        public static int pairSum(ListNode head) {
            List<Integer> values = new ArrayList<>();

            ListNode current = head;

            for (; current != null; current = current.next) {
                values.add(current.val);
            }

            int n = values.size();
            int maxSum = -2147483648;

            for (int i = 0; i < n / 2; ++i) {
                int value = values.get(i) + values.get(n - i - 1);
                if (value > maxSum) {
                    maxSum = value;
                }
            }

            return maxSum;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3, null))));

        System.out.println(Solution.pairSum(head));
    }
}
