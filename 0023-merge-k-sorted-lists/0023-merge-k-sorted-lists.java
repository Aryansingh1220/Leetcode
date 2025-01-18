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
        ArrayList<Integer>list=new ArrayList<>();
        // for(int i=0;i<lists.length;i++){
        //     for(int j=0;j<lists.get(i).size();j++){
        //          list.add(lists.get(i).get(j));
        //     }
        // }
        // Collections.sort(list);
        // return list;
        for (ListNode head : lists) {
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : list) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }
}