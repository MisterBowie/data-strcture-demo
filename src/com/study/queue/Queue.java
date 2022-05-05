package com.study.queue;

public interface Queue<E> {
    /**
     * 获取大小
     *
     * @return
     */
    int getSize();

    /**
     * 是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 入队
     *
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     */
    E dequeue();

    /**
     * 获得队首数据
     * @return
     */
    E getFront();
}
