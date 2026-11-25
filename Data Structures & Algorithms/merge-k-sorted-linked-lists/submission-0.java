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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode a,ListNode b){
                return a.val-b.val;
            }
        });
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(!pq.isEmpty()){
            ans.next=pq.poll();
            ans=ans.next;
            if(ans.next!=null){
                pq.add(ans.next);
            }

        }
        return dummy.next;
    }
}
