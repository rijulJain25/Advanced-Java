package classAndObj;

public class FractionClass {
	private int denominator;
	private int numerator;
	
	public FractionClass(int num, int deno) {
		if(deno == 0) {
			return;
		}
		this.denominator = deno;
		this.numerator = num;
		simplify();
	}
	
	public void print() {
		if(denominator == 1) {
			System.out.println(numerator);
		}else {
			System.out.println(numerator+"/"+denominator);
		}
	}
	
	public void simplify() {
		int gcd = 1;
		int min = Math.min(numerator, denominator);
		for(int i = 2; i<= min; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void setDeno(int deno) throws ZeroDenomenatorException {
		if(deno == 0) {
			ZeroDenomenatorException e = new ZeroDenomenatorException();
			throw e;
		}
		this.denominator = deno;
	}
	
	public void setNume(int num) {
		this.numerator = num;
	}
	
	public int getDeno() {
		return denominator;
	}
	
	public int getNume() {
		return numerator;
	}
	
	public void add(FractionClass f2) {
		this.numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	
	public static FractionClass add(FractionClass f1, FractionClass f2) {
		int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		int newDeno = f1.denominator*f2.denominator;
		FractionClass f3 = new FractionClass(newNum, newDeno);
		return f3;
	}
	
	public void multiply(FractionClass f2) {
		this.numerator = this.numerator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
}
