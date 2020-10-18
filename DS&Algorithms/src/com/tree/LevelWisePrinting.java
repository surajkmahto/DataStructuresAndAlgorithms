package com.tree;


//DSA
//        Q1: you have Binary Tree, you need to print levels in it.
//
//                1
//           2             3
//        4      -     5       6
//                                  7
//
//        O/P:
//        1 ->
//        2 -> 3
//        4 -> 5 -> 6
//        7 ->


import java.util.LinkedList;
import java.util.Queue;

public class LevelWisePrinting {

    private static class Node{
        int data;
        Node left;
        Node right;

        Node(int value){
            data = value;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        PrintLevelOrder(root);
    }

    private static void PrintLevelOrder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node top = q.poll();
            if(top == null) {
                if(!q.isEmpty()){
                    q.add(null);
                }
                System.out.println();
            }
            else{
                System.out.print(top.data + "->");
                if(top.left !=null){
                    q.add(top.left);
                }
                if(top.right !=null){
                    q.add(top.right);
                }
            }
        }
    }
}
