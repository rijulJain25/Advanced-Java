//node class for circular linked list

package CircularLinkedList;

public class Node<T> {
	T data;
	Node next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
}
