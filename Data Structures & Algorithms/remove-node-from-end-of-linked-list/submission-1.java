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
            List<ListNode> nodes=new ArrayList<>();


            ListNode cur=head;

            while(cur!=null){
                nodes.add(cur);
                cur=cur.next;
            }

            int removeInd=nodes.size()-n;

            if(removeInd==0){
                return head.next;
            }

            nodes.get(removeInd-1).next=nodes.get(removeInd).next;

            return head;
    }
}
