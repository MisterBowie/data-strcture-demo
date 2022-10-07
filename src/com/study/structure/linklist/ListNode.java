package com.study.structure.linklist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode init(int[] data) {
        return add(data, 0, new ListNode());
    }

    public static ListNode add(int[] data, int index, ListNode head) {
        if (data.length < (index + 1)) {
            return null;
        }
        head.val = data[index];
        head.next = add(data, index + 1, new ListNode());
        return head;
    }

    @Override
    public String toString() {
//        if (next == null) {
//            return "";
//        }
        return val + (next != null ? "==>" + next: "");
    }
}
