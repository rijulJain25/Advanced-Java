package Stacks;

public class StackLLClass<T> {
	
	private Node<T> head;
	private int size;
	
	public StackLLClass() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return (this.size == 0);
	}
	
	public int size() {
		return this.size;
	}
	
	public T top() throws StackEmptyException{
		if(this.size == 0){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return this.head.data;
	}
	
	public void push(T element) {
		Node<T> newNode = new Node<>(element); 
		if(this.size == 0) {
			size++;
			this.head = newNode;
		}
		else {
			size++;
			newNode.next = this.head;
			this.head = newNode;
		}
	}
	
	public T pop() throws StackEmptyException{
		if(this.size == 0){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		size--;
		T temp = this.head.data;
		this.head = this.head.next;
		return temp;
	}
	
}
