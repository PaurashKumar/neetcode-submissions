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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0,head);
        ListNode groupPre=dummy;

        while(true){
            ListNode kth=getK(groupPre,k);
            if(kth==null){
                break;
            }

            ListNode groupNext=kth.next;

            ListNode pre=kth.next;
            ListNode cur=groupPre.next;

            while(cur!=groupNext){
                ListNode tmp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=tmp;
            }
            ListNode tmp=groupPre.next;

            groupPre.next=kth;
            groupPre=tmp;


        }
        return dummy.next;
    }
    public ListNode getK(ListNode curr,int k){
        while(curr!=null && k>0){
            curr=curr.next;
            k--;
        }
        return curr;

    }
}
