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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode next=null;
        while(current.next!=null){
            if(current.val==current.next.val){
                next=current.next.next;
                current.next=next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }
}