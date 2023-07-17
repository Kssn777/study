package test;

import java.util.HashMap;

public class LRUCache<K,V> {
    class Node{
        K key;
        V value;
        Node prev;
        Node next;
        public Node(){}
        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private HashMap<K,Node> map;
    private int capacity;
    private int size;
    public LRUCache(int capacity) {
        map = new HashMap(capacity);
        this.capacity = capacity;
        this.size = 0;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public V get(K key) {
        Node n = map.get(key);
        if(n==null) {
            return null;
        } else{
            removeNode(n);
            addNode(n);
            return n.value;
        }

    }

    public void put(K key, V value) {
        Node n = map.get(key);
        if(n==null){
            addNode(new Node(key,value));
            if(size>capacity) {
                removeNode(head.next);
            }
        }else{
            removeNode(n);
            addNode(new Node(key,value));
        }

    }

    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        map.remove(node.key);
        --size;
    }
    public void addNode(Node node){
        tail.prev.next = node;
        node.prev = tail.prev;
        node.next = tail;
        tail.prev = node;
        map.put(node.key,node);
        ++size;
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */