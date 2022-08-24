////This the code for Doubly Linked List


package DoublyLinkedList;

import java.util.Scanner;

public class DoublyNodeUse {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null, tail = null, help = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode;
				head.prev = null;
				tail = newNode;
				help = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
				tail.prev = help;
				help = tail;
				
			}
			data = s.nextInt();
		}
		return head;
	}
	
	
	public static Node<Integer> Insertion(Node<Integer> head, int data, int pos){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0) {
			newNode.next = head;
			head.prev = newNode;
			newNode.prev = null;
//			System.out.print(newNode.prev);
			return newNode;
		}
		Node<Integer> temp = head;
		int i = 0;
		while(i<pos-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
		if(newNode.next != null) {
			newNode.next.prev = newNode;
//			System.out.print(newNode.prev+ " " + newNode.next);
		}
		return head;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> tail = null;
		while(head != null) {
			System.out.print(head.data + " ");
			tail = head;
			head = head.next;
		}
		System.out.println();
		System.out.println("Reverse: ");
		while(tail != null) {
			System.out.print(tail.data + " ");
			tail = tail.prev;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		printLL(head);
//		head = Insertion(head, 2, 3);
//		printLL(head);

	}

}
