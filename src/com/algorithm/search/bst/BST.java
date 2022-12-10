package com.algorithm.search.bst;


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

    //前序遍历
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    //中序遍历特点： 可以让数据按照顺序排序
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    /**
     * 后序遍历
     */
    public void traverse() {
        traverse(root);
    }

    private void traverse(Node node) {
        if (node == null) {
            return;
        }
        traverse(node.left);
        traverse(node.right);
        System.out.println(node.e);
    }

    /**
     * 查找最小值
     *
     * @return
     */
    public Node miniNum() {
        return miniNum(root);
    }

    private Node miniNum(Node node) {
        if (node.left == null) {
            return node;
        }
        return miniNum(node.left);
    }

    /**
     * 查找最小值
     *
     * @return
     */
    public Node maxNum() {
        return maxNum(root);
    }

    private Node maxNum(Node node) {
        if (node.right == null) {
            return node;
        }
        return maxNum(node.right);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
