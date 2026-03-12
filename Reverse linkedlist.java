class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next node
            curr.next = prev;          // reverse pointer
            prev = curr;               // move prev forward
            curr = next;               // move curr forward
        }

        return prev; // new head
    }

}