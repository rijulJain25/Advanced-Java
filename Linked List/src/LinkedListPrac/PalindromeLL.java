/*Question:
You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1
-1
Sample Output 2 :
false
true
Explanation for the Sample Input 2 :
For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.

For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.

*/


package LinkedListPrac;

public class PalindromeLL {
	
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> temp = reverseLL(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}
	
	public static boolean chkPalindrome(Node<Integer> head) {
		Node<Integer> curr = head;
		Node<Integer> prev = head;
		Node<Integer> h1 = head;
		
		if(head == null || head.next == null){
            return true;
        }
		
		int count = 0;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		int half = count/2;
		int c = 0;
		while(c != half) {
			c++;
			if(c != half) {
				prev = prev.next;
			}
		}
		h1 = prev.next;
		prev.next = null;
		Node<Integer> current = reverseLL(prev);
		
		while(head.next != null && current.next != null) {
			if(head.data.equals(current.data)) {
				head = head.next;
				current = current.next;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
