package leetcode-dsa-self;

public class q1 {
    public static void main(String[] args) {
        
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = numcreator(l1);
        int num2 = numcreator(l2);

        int sum = num1 + num2;

        // handle case when sum is 0
        if (sum == 0) return new ListNode(0);

        ListNode ans = new ListNode();
        ListNode curr = ans;

        while (sum > 0) {
            int num = sum % 10;
            curr.val = num;
            sum /= 10;

            if (sum > 0) {
                curr.next = new ListNode();
                curr = curr.next;
            }
        }
        return ans;
    }

    static int numcreator(ListNode l) {
        ListNode ptr = l;
        int num = 0;

        while (ptr != null) {
            num = num * 10 + ptr.val;
            ptr = ptr.next;
        }
        return num;
    }
}

