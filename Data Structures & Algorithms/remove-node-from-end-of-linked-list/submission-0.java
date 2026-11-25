/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1,2,3,4,5,6,7
        // 3
        // 1,2,3,4,6,7
        // n=3
        // right=4
        // l=dummy
        // 4,6,7
        // l=4
        // bread;
        // l=l.next.next7

        ListNode right=head;
        ListNode dummy=new ListNode(0,head);
        ListNode left=dummy;

        while(n>0){
            right=right.next;
            n--;
        }

        while(right!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;

        return dummy.next;


    }
}
