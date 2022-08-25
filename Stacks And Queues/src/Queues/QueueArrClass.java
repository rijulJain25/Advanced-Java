package Queues;

public class QueueArrClass {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueArrClass() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int front() {
		if(size == 0) {
			return -1;
		}
		return data[front];
	}
	
	public void enqueue(int element) {
		if(size == 0) {
			front = 0;
		}
		if(size() == data.length) {
			restructure();
		}
		size++;
		rear = (rear+1)%data.length;
		data[rear] = element;
	}
	
	public int dequeue() {
		if(size() == 0) {
			return -1;
		}
		
		int temp = data[front];
		front = (front+1) %data.length;
//		front++;
//		if(front == data.length) {
//			front = 0;
//		}
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
		
	}
	
	public void restructure() {
		int temp[] = data;
		data = new int[2*data.length];
		int index = 0;
		for(int i = front; i< temp.length; i++) {
			data[index] = temp[i];
			index++;
		}
		for(int i = 0; i<=front; i++) {
			data[index] = temp[i];
			index++;
		}
	}
}
