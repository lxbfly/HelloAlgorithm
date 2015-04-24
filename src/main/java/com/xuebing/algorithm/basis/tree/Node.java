/**
 * Node.java   2013-6-23 下午10:46:29 by gavin 
 *
 * Copyright (c) 2000 - 2013 Gavin Lee. All rights reserved.
 * 
 */
package com.xuebing.algorithm.basis.tree;

public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;
    
    public Node(T data) {
        left = null;
        right = null;
        this.data = data;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
    
}
