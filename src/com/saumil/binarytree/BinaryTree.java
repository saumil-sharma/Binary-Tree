package com.saumil.binarytree;

public class BinaryTree {
    private Node head;

    public void addNode(int data) throws Exception{
        if(head == null) {
            this.head = new Node(data, null, null);
            return;
        }

        addNode(this.head, data);
    }

    public void removeNode(int data){
        // TODO: Implmentation of remove node by data.
    }

    public void display(){
        display(this.head, 0, -1);
    }

    private void addNode(Node node, int data) throws Exception{
        if(node.getData() == data){
            throw new Exception("Attempting to add node with number already in tree.");
        }

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
}
