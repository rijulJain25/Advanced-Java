/*Question:
You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
Note :
Try solving this in O(1) auxiliary space.

No need to print the list, it has already been taken care.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the first sorted singly linked list separated by a single space. 

The second line of the input contains the elements of the second sorted singly linked list separated by a single space. 
Remember/Consider :s
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output :
For each test case/query, print the resulting sorted singly linked list, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t = 10^2
0 <= N <= 10 ^ 4
0 <= M <= 10 ^ 4
Where N and M denote the sizes of the singly linked lists. 

Time Limit: 1sec
Sample Input 1 :
1
2 5 8 12 -1
3 6 9 -1
Sample Output 1 :
2 3 5 6 8 9 12 
Sample Input 2 :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1
Sample Output 2 :
2 3 5 6 8 9 12 
10 10 20 30 40 40 50 60 60 60 80 90 100
*/


package LinkedListPrac;

import java.util.Scanner;

public class MergingTwoSortedLL {

	public static Node<Integer> MergingLL(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		Node<Integer> newHead = null;
		if(head1.data<head2.data) {
			newHead = head1;
		}
		else {
			newHead = head2;
		}
		
		Node<Integer> newTail = newHead;
		while(head1 != null && head2 != null) {
			Node<Integer> temp = null;
			if(head1.data<head2.data) {
				temp = head1;
				head1 = head1.next;
			}
			else {
				temp = head2;
				head2 = head2.next;
			}
			newTail.next = temp;
			newTail = temp;
		}
		if(head1 != null) {
			newTail.next = head1;
			head1 = head1.next;
		}
		else if(head2 != null) {
			newTail.next = head2;
			head2 = head2.next;
		}
		return newHead;
	} 
	
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
