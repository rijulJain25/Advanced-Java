package Generics;

public class pair<T, V> {
	
	private T a;
	private V b;
	
	public pair(T a, V b) {
		this.a = a;
		this.b = b;
	}
	
	public void seta(T num) {
		this.a = num;
	}
	
	public void setb(V num) {
		this.b = num;
	}
	
	public T geta() {
		return a;
	}
	
	public V getb() {
		return b;
	}
}
