package classAndObj;

public class PolynomialClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolynomialClass p= new PolynomialClass();
		p.setCoefficient(4, 2);
		p.setCoefficient(1, 1);
		p.setCoefficient(2, 3);
		p.setCoefficient(3, 4);
		p.print();
		
		PolynomialClass p2 = new PolynomialClass();
		p2.setCoefficient(4, 2);
		p2.setCoefficient(1, 1);
		p2.setCoefficient(2, 3);
		p2.setCoefficient(3, 4);
		
		p.add(p2);
		p.print();
		
		PolynomialClass p3 = PolynomialClass.add(p, p2);
		p3.print();
		
		int ans = p.evaluate(2);
		System.out.println(ans);
	}

}
