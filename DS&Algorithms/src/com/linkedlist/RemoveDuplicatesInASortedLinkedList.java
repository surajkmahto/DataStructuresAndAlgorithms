package com.linkedlist;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}


public class RemoveDuplicatesInASortedLinkedList {

    public ListNode deleteDuplicates(ListNode A) {
        ListNode B = A;
        while(A!=null && A.next!=null){
            if(A.val==A.next.val){
                A.next = A.next.next;
            }
            else{
                A = A.next;
            }
        }
        return B;
    }
}
