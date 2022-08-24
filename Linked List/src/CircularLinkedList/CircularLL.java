
//This the code for Circular Singly Linked List


package CircularLinkedList;

import java.util.Scanner;

public class CircularLL {
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;
		do {
			System.out.print(head.data+" ");
			head = head.next; 
		}while(temp != head);
		System.out.println();
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null, tail= null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
				tail.next = head;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> Insertion(Node<Integer> head, int data, int pos){
		if(head == null) {
			return head;
		}
		
		Node<Integer> tail = head;
		int count = 0;
		do {
			tail = tail.next;
			count++;
		}while(tail.next != head);
		
		Node<Integer> newNode = new Node<Integer>(data);		
		if(pos == 0 || pos == count) {
			newNode.next = head;
			tail.next = newNode;
			System.out.println(tail.next.data);
			return newNode;
		}
		Node<Integer> temp = head;
		int i = 0;
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		newNode.next =  temp.next;
		temp.next = newNode;
		return head;
	}
	
	public static Node<Integer> Deletion(Node<Integer> head, int pos){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> tail = head;
		int count = 0;
		do {
			tail = tail.next;
			count++;
		}while(tail.next != head);
		
		if(pos == 0) {
			tail.next = head.next;
			head = head.next;
		}
		Node<Integer> temp = head;
		int i =0;
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return head;
 	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node<Integer> head = takeInput();
		printLL(head);
		head = Insertion(head, 6, 0);
		printLL(head);
	}

}
