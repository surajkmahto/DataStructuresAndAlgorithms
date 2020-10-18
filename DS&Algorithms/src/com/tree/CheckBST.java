package com.tree;

import java.util.ArrayList;
import java.util.List;

public class CheckBST {

    Node root;

    public CheckBST() {
        super();
    }

    public CheckBST(Node root) {
        super();
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        CheckBST tree = new CheckBST();
        tree.setRoot(root);
        tree.getRoot().setLeft(new Node(2));
        tree.getRoot().setRight(new Node(3));
        tree.root.left.setLeft(new Node(4));
        tree.root.left.setRight(new Node(5));
        tree.root.right.setLeft(new Node(6));
        tree.root.right.setRight(new Node(7));

        tree.root.left.left.setLeft(new Node(8));
        tree.root.left.left.setRight(new Node(9));
        int ans = isTreeBST(tree.root);
    }

    private static int isTreeBST(Node root) {
       if(isTreeBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
           return 1;
       }
       else
           return 0;

    }

    private static boolean isTreeBSTUtil(Node root, int minValue, int maxValue) {
        if(root==null){
            return true;
        }

        if(root.data<minValue || root.data>maxValue){
            return false;
        }
        return (isTreeBSTUtil(root.left,minValue,root.data-1) && isTreeBSTUtil(root.right,root.data+1,maxValue));
    }


}
