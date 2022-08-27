package classAndObj;

public class ComplexClass {
	private int imaginary;
	private int real;
	
	public ComplexClass(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void print() {
		if(real == 0) {
			System.out.println(imaginary+"i");
		}
		else if(imaginary == 0) {
			System.out.println(real);
		}
		else {
			System.out.println(real+"+"+imaginary+"i");
		}
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void add(ComplexClass c1) {
		this.real = this.real + c1.real;
		this.imaginary = this.imaginary + c1.imaginary;
	}
	
	public static ComplexClass add(ComplexClass c1, ComplexClass c2) {
		int newReal = c1.real+c2.real;
		int newImaginary = c1.imaginary+c2.imaginary;
		ComplexClass c3 = new ComplexClass(newReal, newImaginary);
		return c3;
	}
	
	public void multiply(ComplexClass c2) {
		this.real = this.real*c2.real + (-1)*this.imaginary*c2.imaginary;
		this.imaginary = this.real*c2.imaginary + this.imaginary*c2.real; 
	}
	
	public ComplexClass conjugate() {
		int newImag = (-1) * this.imaginary; 
		int newReal = this.real;
		ComplexClass c3 = new ComplexClass(newReal, newImag);
		return c3;
	}
	
}
