package com.tree;

import java.util.LinkedList;
import java.util.Queue;

class NodeC{
    
    int data;
    NodeC left;
    NodeC right;
    NodeC next;

    public NodeC(int data, NodeC left, NodeC right, NodeC next) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    public NodeC(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.next = null;
    }


}

public class ConnectNodesAtSameLevel {
    public static void main(String[] args) {
        NodeC root = new NodeC(1);
        root.left = new NodeC(2);
        root.right =  new NodeC(3);
        connectSameLevelNodeC(root);
        System.out.println(root.next);
        System.out.println(root.left.next.data);
        System.out.println(root.right.next);
    }

    static void connectSameLevelNodeC(NodeC root){
        if(root == null){
            return;
        }
        Queue<NodeC> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            NodeC temp = queue.poll();
            if(temp!=null){
                temp.next = queue.peek();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            else if(!queue.isEmpty()){
                queue.add(null);
            }
        }
    }
}

