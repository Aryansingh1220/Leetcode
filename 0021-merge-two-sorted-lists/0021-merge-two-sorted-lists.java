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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode current=list1;
        ListNode curr=list2;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        while(curr != null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0); 
        ListNode merged = dummy;

        for (int val : list) {
            merged.next = new ListNode(val);
            merged = merged.next;
        }

        return dummy.next;
        
    }
}