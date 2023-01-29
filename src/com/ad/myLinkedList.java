package com.ad;

public class myLinkedList {
	Node head;
	
	int size;
	public void add(int value) {
				if(head == null) {
			head = new Node(value);
		}else {
			Node temp = head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(new Node(value));
		}
				size++;
	}

}

class Node{
	private int value;
	
	private Node next;
	public Node(int value){
		this.value=value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}