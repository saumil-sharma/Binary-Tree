package com.saumil.binarytree;

public class BinaryTree {
    private Node head;

    public void addNode(int data) throws Exception{
        if(head == null) {
            this.head = new Node(data, null, null);
            return;
        }

        if(!exists(data)){
            addNode(this.head, data);
        } else {
            throw new Exception("Number already in tree.");
        }
    }

    public void removeNode(int data){
        // TODO: Implmentation of remove node by data.
    }

    public void display(){
        display(this.head, 0, -1);
    }

    public boolean exists(int data){
        return exists(this.head, data);
    }

    private void addNode(Node node, int data){
        if(node.getData() > data){
            if(node.getRight() == null){
                node.setRight(new Node(data));
                return;
            }

            addNode(node.getRight(), data);
        } else {
            if(node.getLeft() == null){
                node.setLeft(new Node(data));
                return;
            }

            addNode(node.getLeft(), data);
        }
    }

    /**
     * @param type -1 if its a root node, 0 if it's a right node, 1 if it's a left node.
     */
    private void display(Node node, int depth, int type){
        for(int i = 1; i < depth; i++){
            System.out.print("   ");
        }

        switch(type){
            case 0:
                System.out.print("├──");
                break;
            case 1:
                System.out.print("└──");
                break;
            default:
        }

        System.out.print(node.getData() + "\n");

        if(node.getRight() != null){
            display(node.getRight(), depth + 1, 0);
        }

        if(node.getLeft() != null){
            display(node.getLeft(), depth + 1, 1);
        }
    }


    private boolean exists(Node node, int data){
        if(node.getData() == data){
            return true;
        }

        if(node.getData() > data && node.getRight() != null){
            return exists(node.getRight(), data);
        } else if(node.getData() < data && node.getLeft() != null){
            return exists(node.getLeft(), data);
        } else {
            return false;
        }
    }

}
