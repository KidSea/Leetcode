package daily;
/*
输入一个链表，反转链表后，输出新链表的表头。
 */
public class demo44 {
    public static void main(String[] args) {
        demo44 demo44 = new demo44();

    }
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode preHead = head;
        ListNode curHead = null;
        ListNode tempHead = null;
        while (preHead != null) {
            tempHead = preHead.next;
            preHead.next = curHead;
            curHead = preHead;
            preHead = tempHead;
        }
        return curHead;
    }
}
