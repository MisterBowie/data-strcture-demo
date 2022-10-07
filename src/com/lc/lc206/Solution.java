package com.lc.lc206;

import com.study.structure.linklist.ListNode;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null; // 申明前面的数据
        ListNode cur = head;// 当前的数据
        while (cur != null) {
            ListNode next = cur.next; // 下一个数据
            cur.next = pre;// 当前的next为null
            pre = cur; // 这里current 就只为1
            cur = next;// cur= 2
            System.out.println(pre);
        }
        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rev = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode init = ListNode.init(nums);
        System.out.println(init);
        Solution solution = new Solution();
        ListNode rev = solution.reverseList2(init);
        System.out.println(rev);
    }
}
