package LeetCodeTraining.AddTwoNumbers;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode value = head;
        while (l1 != null || l2 != null) {
            if (l1 != null) value.val += l1.val;
            if (l2 != null) value.val += l2.val;

            value.next = new ListNode();

            if (value.val > 9) {
                value.next.val = 1;
                value.val = value.val - 10;
            }

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            if (l1 == null && l2 == null && value.next.val == 0) {
                value.next = null;
            } else {
                value = value.next;
            }
        }
        return head;
    }
}
