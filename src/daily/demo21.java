package daily;

import java.util.HashMap;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class demo21 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode newRandomListNode = new RandomListNode(pHead.label);
        RandomListNode cur = pHead;
        RandomListNode target = newRandomListNode;

        HashMap<RandomListNode, RandomListNode> RandomListNodes = new HashMap<>();
        // 第一次循环根据现有节点，创建新节点；
        while(pHead != null) {
            RandomListNodes.put(pHead, new RandomListNode(pHead.label));
            pHead = pHead.next;
        }

        // 第二次循环创建新的链表；
        while (cur != null) {
            target.next = (cur.next == null) ? null : RandomListNodes.get(cur.next);
            target.random = (cur.random == null) ? null : RandomListNodes.get(cur.random);

            cur = cur.next;
            target = target.next;
        }

        return newRandomListNode;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
