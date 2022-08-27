package classAndObj;

public class ComplexClassUse {
	public static void main(String[] args) {
		ComplexClass c1 = new ComplexClass(3, 4);
		c1.print();
		
		ComplexClass c2 = new ComplexClass(5, 6);
		c2.print();
		
		c1.add(c2);
		c1.print();
		
		ComplexClass c3 = ComplexClass.add(c1, c2);
		c3.print();
		
		c1.multiply(c2);
		c1.print();
		
		ComplexClass c4 = c1.conjugate();
		c4.print();
	}
}
