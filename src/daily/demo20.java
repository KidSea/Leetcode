package daily;

import java.util.Stack;

/**
 * 设计堆栈结构，能够获取堆栈的最小值，时间复杂度为O(1)
 */
public class demo20 {
    Stack<Integer> integerStack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();
    public void push(int node) {
        integerStack.push(node);
        if (minstack.empty()) {
            minstack.push(node);
        } else {
            if (node > minstack.peek()) {
                minstack.push(minstack.peek());
            } else {
                minstack.push(node);
            }
        }
    }

    public void pop() {
        integerStack.pop();
        minstack.pop();
    }

    public int top() {
        return integerStack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}
