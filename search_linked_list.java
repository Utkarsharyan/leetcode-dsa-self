// Given the head of a singly linked list and a value X,
// determine whether X exists in the linked list.

// Example
// List: 10 → 20 → 30 → 40 → null
// X = 30
// Output: true
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class search_linked_list {
    static boolean search(ListNode head, int x) {
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == x) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}

