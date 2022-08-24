//ArrayList

package ArrayList;

import java.util.ArrayList;

public class ArrayListUse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		a.add(12);
		a.add(13);
		a.add(11);
		a.add(1);
		a.add(34);
		System.out.println(a.isEmpty());
		a.remove(4);
		a.set(1, 100);
		for(int i = 0; i<a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		
		a.remove(4);
		a.set(1, 100);
		for(int i = 0; i<a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		
		
//		in this type of fore loop we iterate directly on the elements of the array 
//		for(int elem: a) {
//			System.out.print(elem+" ");
//		}
	}

}
