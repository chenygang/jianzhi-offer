package cn.jianzhi.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * <p>
 * 解决思路
 * 1.使用递归调用（本质是栈）
 * 2.显示的使用栈
 * 3.逆转整个链表
 */
public class PrintListFromTailToHead {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 使用递归调用
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            if (listNode.next != null)
                ret = printListFromTailToHead(listNode.next);
            ret.add(listNode.val);
        }
        return ret;
    }

    /**
     * 显示的使用栈
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            ret.add(stack.pop().val);
        }
        return ret;
    }

    /**
     * 使用头插法逆转链表
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        ListNode head = new ListNode(-1); // 头节点
        while (listNode != null) {
            ListNode next = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = next;
        }
        while (head.next != null) {
            ret.add(head.next.val);
            head = head.next;
        }
        return ret;
    }
}
