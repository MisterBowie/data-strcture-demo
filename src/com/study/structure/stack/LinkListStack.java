package com.study.structure.stack;

import com.study.structure.linklist.LinkList;

/**
 * 用链表实现的栈
 * @param <E>
 */
public class LinkListStack<E> implements Stack<E> {
    private LinkList<E> list;

    public LinkListStack() {
        list = new LinkList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack top:");
        res.append(list);
        return res.toString();
    }
}
