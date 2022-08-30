//Stack class using array

package Stacks;

public class StackArrClass {
	
	private int data[];
	private int top;
	
	public StackArrClass() {
		data = new int[10];
		top = -1;
	}
	
	public StackArrClass(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top+1;
	}
	
	public void push(int ele) {
		if(size() == data.length){
			restructure();
		}
		top++;
		data[top] = ele;
	}
	
	public void restructure() {
		int temp[] = data;
		data = new int[data.length*2];
		for(int i = 0; i< temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	public int pop() throws StackEmptyException{
		if(isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	public int top() throws StackEmptyException{
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
}
