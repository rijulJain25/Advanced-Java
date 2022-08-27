package classAndObj;

public class DynamicArray {
	private int arr[];
	private int nextIdx;
	
	public DynamicArray() {
		arr = new int[10];
		nextIdx = 0;
	}
	
	public int size() {
		return nextIdx;
	}
	
	public void add(int element) {
		if(nextIdx == arr.length) {
			restructure();
		}
		arr[nextIdx] = element;
		nextIdx++;
	}
	
	public void set(int idx, int ele) {
		if(idx > nextIdx) {
			return;
		}
		if(idx < nextIdx) {
			arr[idx] = ele;
		}
		else {
			add(ele);
		}
	}
	
	public int get(int idx) {
		if(idx >= nextIdx) {
			return -1;
		}
		return arr[idx];
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int removeLast() {
		if(size() == 0) {
			return -1;
		}
		int value = arr[nextIdx-1];
		arr[nextIdx-1] = 0;
		nextIdx--;
		return value;
	}
	
	public void restructure() {
		int temp[] = arr;
		arr = new int[arr.length*2];
		for(int i = 0; i<temp.length; i++) {
			arr[i] = temp[i];
		}
	}
	
}
