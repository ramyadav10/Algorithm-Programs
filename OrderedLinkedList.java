package com.algorithm;

public class OrderedLinkedList {
   
	public static class Node {
        private int data;
        private Node next;

        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    //Adding nodes to the list
    public void addTo(int x) {
        Node node = new Node(x);
        if (head == null) {
            this.head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Node getHead(){
        return head;
    }

    
    //Nodes size
    public int size(){
        Node temp = head;
        int i = 0;
        while (temp != null){
            i++;
            temp = temp.next;
        }
        return i;
    }

    public boolean findNode(int x){
        Node temp = head;
        while (temp != null){
            if (temp.data == x){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    //displayList() will display all the nodes
    public void displayList() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        System.out.println("Nodes of Linked List :");
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println("\b");

    }

    //Sorting using bubble sort
    public void sort(){
        for (Node i = head; i.next != null; i = i.next){
            for (Node j = head; j.next != null; j = j.next){
                if (j.data > i.next.data){
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    	OrderedLinkedList slList = new OrderedLinkedList();
    	int[] number= {11, 12, 13, 14};
    	for (int j=0; j<number.length; j++){
                slList.addTo(number[j]);
        }
    	System.out.println("After adding some nodes in LinkedList :");
        slList.displayList();

        int array[] = {31, 56, 26, 24};

        for (int i=0; i<array.length; i++){
            if (slList.findNode(array[i])){
                continue;
            } else {
                slList.addTo(array[i]);
            }
        }
        System.out.println("After Adding more nodes in LinkedList : ");
        slList.displayList();
        System.out.println("After Ordered nodes in LinkedList : ");
        slList.sort();
        slList.displayList();

    }
}