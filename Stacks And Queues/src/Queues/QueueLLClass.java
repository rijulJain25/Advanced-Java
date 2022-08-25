package Queues;

public class QueueLLClass<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueLLClass() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public T front() throws QueueEmptyException{
		if(size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return front.data;
	}
	
	public void enqueue(T element) {
		Node<T> newNode = new Node<>(element);
		if(size == 0) {
			front = newNode;
			rear = newNode;
			size++;
		}
		else {
			rear.next = newNode;
			rear = newNode;
			size++;
		}
	}
	
	public T dequeue() throws QueueEmptyException{
		if(size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		T temp = front.data;
		front = front.next;
		if(size == 1) {
			rear = null;
		}
		size--;
		return temp;
	}
	
}
