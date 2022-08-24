package LinkedListPrac;

import java.util.Scanner;

public class NodeUse {
	
	public static Node<Integer> DeleteNode(Node<Integer> head, int pos){
		if(pos == 0) {
			head = head.next;
			return head;
		}
		
		int i = 0;
		Node<Integer> temp = head;
		while(i <pos-1 && temp.next !=null) {
			temp = temp.next;
			i++;
		}
		if(temp.next == null) {
			return head;
		}
		temp.next = temp.next.next;
		return head;
 	}
	
	public static Node<Integer> InsertNode(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0) {
			newNode.next = head;
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
		return head;
	}

	public static Node<Integer> takeInput(){
		Node<Integer> head = null, tail = null;
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
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void printLinkedList(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		printLinkedList(head);

	}

}
