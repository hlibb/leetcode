package Easy.RemoveLinkedListElements203Test;

import Easy.RemoveLinkedListElements203.ListNode;
import Easy.RemoveLinkedListElements203.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveLinkedListElements203Test {
    @Test
    public void test1() {
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        ListNode newHead = s.removeElements(head, 6);

        // Assert that the new head is correct
        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(3, newHead.next.next.val);
        assertEquals(4, newHead.next.next.next.val);
        assertEquals(5, newHead.next.next.next.next.val);
        assertNull(newHead.next.next.next.next.next);
    }
}

