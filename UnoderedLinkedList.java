package com.algorithm;

import com.algorithm.OrderedLinkedList.Node;

public class UnoderedLinkedList {
   
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

    //Remove nodes to the Given pos
    public void remNodeAtPos(int pos, int target, Node head){
        Node temp = head;
        Node prev = head;
        if (temp != null && temp.data == target){
            temp = temp.next;
            return;
        }
        while (temp != null && temp.data != target){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        if (temp == null)
            return;
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
            System.out.println("Singly Linked List is Empty");
        }
        System.out.println("Node's of Singly Linked List :");
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
    	UnoderedLinkedList slList = new UnoderedLinkedList();
    	int[] number= {101,202,303,404};
    	for (int j=0; j<number.length; j++){
                slList.addTo(number[j]);
        }
    	System.out.println("After adding some nodes in LinkedList :");
        slList.displayList();

        int array[] = {10, 21, 32, 43};

        for (int i=0; i<array.length; i++){
            if (slList.findNode(array[i])){
                continue;
            } else {
                slList.addTo(array[i]);
            }
        }
        System.out.println("After Adding more nodes in LinkedList : ");
        slList.displayList();

    }
}