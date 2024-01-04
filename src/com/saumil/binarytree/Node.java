package com.saumil.binarytree;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data){
        this.data = data;
    }

    public Node(){}

    public int getData(){
        return this.data;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }
}
