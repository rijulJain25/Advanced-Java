package classAndObj;

public class FractionClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractionClass f1 = new FractionClass(3, 5);
		f1.print();
		f1.setNume(34);
		try {
			f1.setDeno(176);
		}catch(ZeroDenomenatorException Exception) {
			System.out.println("Denomenator can't be zero");
		}
		
		FractionClass f2 = new FractionClass(7, 9);
		f2.print();
		
		f1.add(f2);
		
		FractionClass f3 = FractionClass.add(f1, f2);
		f3.print();
		f1.print();
		f2.print();
		
		f1.multiply(f2);
		f1.print();
		
//		FractionClass f4 = new FractionClass()
	}

}
