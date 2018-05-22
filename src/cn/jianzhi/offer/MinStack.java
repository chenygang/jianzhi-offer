package cn.jianzhi.offer;

import java.util.Stack;

/**
 * ��Ŀ����
 * <p>
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 * <p>
 * ���˼·
 * <p>
 * ʹ��һ��ջ������Сֵ
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
