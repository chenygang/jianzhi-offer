package cn.jianzhi.offer;

import java.util.Stack;

/**
 * 题目描述
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 解答思路
 * <p>
 * 使用一个栈跟踪最小值
 */
public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {

        if (stack.isEmpty()) {
            minStack.push(node);
        } else {
            if (top() < node)
                minStack.push(top());
            else
                minStack.push(node);
        }
        stack.push(node);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
