package com.study.linklist;

public class LinkList<E> {

    private class Node {

        public E e;

        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;

    private int size;

    public LinkList() {
        head = null;
        size = 0;
    }

    //获取链表个数
    public int getSize() {
        return size;
    }

    //链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e){
        head = new Node(e,head);
        size++;
    }

}
