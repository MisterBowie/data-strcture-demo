package com.study.structure.BST;


/**
 * 二叉搜索树
 *
 * @param <E>
 */
public class BST<E extends Comparable> {

    public class Node {
        E e;
        Node left, right;

        public Node(E e) {
            this.e = e;
        }
    }

    private Node root;

    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    /**
     * 判断是否包含元素
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return contains(root, e);
    }
    public boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }
}
