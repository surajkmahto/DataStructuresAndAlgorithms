package com.tree;

// Lowest Common Ancestor
public class LCA_BinaryTree {
    public static void main(String[] args) {

    }

    public static Node GetLCA(Node root, Node n1, Node n2){
        if(root==null) return null;
        if(root == n1 || root ==n2) return root;

        GetLCA(root.left, n1, n2);
        GetLCA(root.right, n1, n2);

        if(root.left!=null && root.right!=null) return root;
        if(root.left==null && root.right==null) return null;

        if(root.left!=null){
            return root.left;
        }
        else{
            return root.right;
        }
    }
}
