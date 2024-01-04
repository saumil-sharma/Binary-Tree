package com.saumil;

import com.saumil.binarytree.BinaryTree;
import com.saumil.util.IO;

public class App {
    public static void main(String[]args){
        App mainApp = new App();
        mainApp.start();
    }

    private void start(){
        BinaryTree mainBinaryTree = new BinaryTree();

        while(true){
            String option = IO.promptOption();

            switch(option){
                case "A":
                    try{
                        mainBinaryTree.addNode(Integer.parseInt(IO.prompt("Please enter a number:")));
                    } catch (Exception ex){
                        IO.logError(ex);
                    }
                    break;
                case "R":
                    mainBinaryTree.removeNode(Integer.parseInt(IO.prompt("Please enter the number you want removed:")));
                    break;
                case "V":
                    mainBinaryTree.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
