package Stacks;

public class StackArrClassUse {
	
	public static void main(String[] args) throws StackEmptyException {
		StackArrClass s = new StackArrClass();
		s.push(12);
		s.push(2);
		s.push(8);
		s.push(9);
		s.push(10);
		s.push(4);
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		s.push(2);
		s.push(8);
		s.push(9);
		s.push(10);
		System.out.println(s.size());
	}
}
