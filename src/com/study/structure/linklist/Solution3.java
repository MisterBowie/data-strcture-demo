package com.study.structure.linklist;

/**
 * leetcode 203题 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode res = removeElements(head.next, val);
        return res.val == val ? res.next : head;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};


    }
}
