package daily;

import java.util.ArrayList;
import java.util.Stack;

/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class demo30 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        int ret = stack2.peek();
        stack2.pop();
        return ret;
    }
}
