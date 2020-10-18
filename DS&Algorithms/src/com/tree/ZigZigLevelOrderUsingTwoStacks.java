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
import java.util.Stack;

public class ZigZigLevelOrderUsingTwoStacks {

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
        Stack<Node> currLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        currLevel.push(root);

        boolean leftToRight = true;

        // check if stack is empty
        while (!currLevel.isEmpty()) {

            // pop out of stack
            Node node = currLevel.pop();

            // print the data in it
            System.out.print(node.data + " ");

            // store data according to current
            // order.
            if (leftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }

                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            }
            else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }

                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }

            if (currLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> temp = currLevel;
                currLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
}
