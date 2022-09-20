package Easy.MergeTwoSortedLists21;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy; // use p to move, build target list
        ListNode p1 = list1, p2 = list2; // use 2 pointer p1, p2 to move

        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        } else {
            p.next = p2;
        }
        return dummy.next;
    } //solution found
}
