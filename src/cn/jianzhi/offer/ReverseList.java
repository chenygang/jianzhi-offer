package cn.jianzhi.offer;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出链表的所有元素。
 *
 * 解决思路
 * 头插法
 * 注意有没有头节点
 */
public class ReverseList {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
