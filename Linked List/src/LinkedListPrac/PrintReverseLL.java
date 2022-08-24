//Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
// Note :
//No need to print the list, it has already been taken care. Only return the new head to the list.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
//Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
//Output format :
//For each test case/query, print the elements of the updated singly linked list.
//
//Output for every test case will be printed in a seperate line.
// Constraints :
//1 <= t <= 10^2
//0 <= M <= 10^4
//Where M is the size of the singly linked list.
//
//Time Limit: 1sec
//Sample Input 1 :
//1
//1 2 3 4 5 6 7 8 -1
//Sample Output 1 :
//8 7 6 5 4 3 2 1
//Sample Input 2 :
//2
//10 -1
//10 20 30 40 50 -1
//Sample Output 2 :
//10 
//50 40 30 20 10 

package LinkedListPrac;

import java.util.Scanner;

public class PrintReverseLL {
	
	public static Node<Integer> DeleteNode(Node<Integer> head, int pos){
		if(pos == 0) {
			head = head.next;
			return head;
		}
		Node<Integer> temp = head;
		int i = 0;
		
		while(i<pos-1 && temp.next != null) {
			temp = temp.next;
			i++;
		}
		
		if(head.next == null) {
			return head;
		}
		temp.next = temp.next.next;
		return head;
	}
	
	public static Node<Integer> InsertNode(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<>(data);
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
	
	public static void ReverseLL(Node<Integer> head){
		if(head == null) {
			return;
		}
		ReverseLL(head.next);
		System.out.print(head.data+" ");
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

	}

}
