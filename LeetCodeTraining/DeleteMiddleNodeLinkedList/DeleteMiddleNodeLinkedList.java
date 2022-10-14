package LeetCodeTraining.DeleteMiddleNodeLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteMiddleNodeLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        int i = 0;
        ListNode value = head;

        while (value != null) {
            value = value.next;
            ++i;
        }

        i /= 2;
        value = head;

        for (int k = 1; k < i; ++k) {
            System.out.println(value.val);
            value = value.next;
        }

        value.next = value.next.next;

        return head;
    }
}
