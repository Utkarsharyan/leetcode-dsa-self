// Floyd’s Cycle Detection Algorithm
// Time: O(n), Space: O(1)

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class cycledetection {

    // Detects if a cycle exists in the linked list
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true;           // cycle detected
            }
        }
        return false;                  // no cycle
    }

    // Helper method to create a cycle for testing
    // pos = index where tail connects (0-based), -1 means no cycle
    public static void createCycle(ListNode head, int pos) {
        if (pos < 0) return;

        ListNode tail = head;
        ListNode cycleNode = null;
        int index = 0;

        while (tail.next != null) {
            if (index == pos) {
                cycleNode = tail;
            }
            tail = tail.next;
            index++;
        }
        tail.next = cycleNode;
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create cycle: tail connects to node with value 3
        createCycle(head, 2);

        System.out.println(hasCycle(head)); // true
    }
}
