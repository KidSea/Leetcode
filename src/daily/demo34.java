package daily;

import java.util.ArrayList;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 * 删除给出链表中的重复元素（链表中元素从小到大有序），使链表中的所有元素都只出现一次
例如：
给出的链表为,返回.
给出的链表为,返回.
 */
public class demo34 {
    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head == null || head.next == null) return head;
        ArrayList<Integer> vals = new ArrayList<>();
        ListNode pHead = head;
        ListNode lastHead = head;

        while(head != null) {
            if (!vals.contains(head.val)) {
                vals.add(head.val);
            } else {
                lastHead.next = head.next;
                head.next = null;
                head = lastHead.next;
                continue;
            }
            lastHead = head;
            head = head.next;
        }
        return pHead;
    }
}
