package Amazon;

class Node{
    int data;
    Node left;
    Node right;
    Node next;

    public Node(int data, Node left, Node right, Node next) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.next = null;
    }


}

public class Test2 {
    public static void main(String[] args) {

    }

}
