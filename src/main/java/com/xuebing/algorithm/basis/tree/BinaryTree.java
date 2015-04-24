package com.xuebing.algorithm.basis.tree;

/**
 * BinaryTree.java 2013-6-23 下午10:43:15 by gavin
 * 
 * Copyright (c) 2000 - 2013 Gavin Lee. All rights reserved.
 * 
 */
public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public void buildTree(T[] data) {
        for (int i = 0; i < data.length; i++) {
            insertNode(data[i]);
        }
    }

    private void insertNode(T data) {
        root = insertNode(root, data);
    }

    private Node<T> insertNode(Node<T> node, T data) {
        if (node == null) {
            node = new Node<T>(data);
        } else {
            if (data.hashCode() > node.getData().hashCode()) {
                node.setRight(insertNode(node.getRight(), data));
            } else {
                node.setLeft(insertNode(node.getLeft(), data));
            }
        }
        return node;
    }

    public void printTree() {
        printTree(root);
        System.out.println();
    }

    private void printTree(Node<T> node) {
        if (node == null)
            return;

        //        System.out.print(node.getData() + " ");
        //        printTree(node.getLeft());
        //        printTree(node.getRight());

        printTree(node.getLeft());
        System.out.print(node.getData() + "  ");
        printTree(node.getRight());
    }

    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        Integer[] data = {2, 8, 7, 4, 9, 3, 1, 6, 7, 5};
        bt.buildTree(data);
        bt.printTree();
    }
}