package com.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrder {
    static Map<Integer, List<Node>> map = new TreeMap<>();

    Node root;

    public VerticalOrder() {
        super();
    }

    public VerticalOrder(Node root) {
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
        VerticalOrder tree = new VerticalOrder();
        tree.setRoot(root);
        tree.getRoot().setLeft(new Node(2));
        tree.getRoot().setRight(new Node(3));
        tree.root.left.setLeft(new Node(4));
        tree.root.left.setRight(new Node(5));
        tree.root.right.setLeft(new Node(6));
        tree.root.right.setRight(new Node(7));

        tree.root.left.left.setLeft(new Node(8));
        tree.root.left.left.setRight(new Node(9));
        printVerticalOrder(tree.root);

    }

    private static void printVerticalOrder(Node root) {
        preorderTraversal(root,0);
        for(Map.Entry<Integer,List<Node>> entry : map.entrySet()){
            List<Node> ans = entry.getValue();
            for (Node nod:
                 ans) {
                   System.out.print(nod.data + " ");
            }
            System.out.println();
        }
    }

    private static void preorderTraversal(Node root, int hd) {
        if(root==null){
            return;
        }
        if(map.containsKey(hd)){
            List<Node> list = map.get(hd);
            list.add(root);
            map.put(hd,list);
        }
        else{
            List<Node> list2= new ArrayList<>();
            list2.add(root);
            map.put(hd,list2);
        }
        preorderTraversal(root.left, hd - 1);
        preorderTraversal(root.right,hd + 1);

    }
}
