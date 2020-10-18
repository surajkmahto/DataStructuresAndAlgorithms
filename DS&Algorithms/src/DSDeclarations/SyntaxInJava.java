package DSDeclarations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;

public class SyntaxInJava {
    public static void main(String[] args) throws FileNotFoundException {
        // Input From Console
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //FileReader
        FileReader fr = new FileReader("abc.txt");
        BufferedReader fileBufferReader  = new BufferedReader(fr);

        // Stack
        Stack<Integer> myStack = new Stack<>();

        // Queue
        Queue<Integer> myQueue = new LinkedList<>();
        AbstractQueue<Integer> abstractQueue = new LinkedBlockingDeque<>();
        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // We can create our simple Queue implementation using AbstractQueue.
        // Abstract Queue :: ArrayBlockingQueue, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque,
        //                   LinkedBlockingQueue, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue, SynchronousQueue

        //LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        //Deque or DoublyLinkedList
        Deque<Integer> deque = new LinkedList<>();

        //Set
        Set<Integer> set = new HashSet<>();
        AbstractSet<Integer> abstractSet = new CopyOnWriteArraySet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // We can create our simple Set implementation using AbstractSet.

        //Map
        Map<Integer,Character> map = new HashMap<>();
        Map<Integer,Character> treeMap = new TreeMap<>();
        Map<Integer,Character> concurrentHashMap = new ConcurrentHashMap<>();
        Map<Integer,Character> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,Character> hashtable = new Hashtable<>();
     }
}
