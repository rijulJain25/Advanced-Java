package classAndObj;

public class PolynomialClass {
	private int[] coefficient;
	private int degree;
	
	
	public PolynomialClass() {
		coefficient = new int[5];
		degree = -1;
	}
	
	public void setCoefficient(int degree, int coeff) {
		if(degree >= coefficient.length) {
			restructure();
		}
		coefficient[degree] = coeff;
		if( degree >this.degree) {
			this.degree = degree;
		}
	}
	
	public int degreePrt() {
		return this.degree;
	}
	
	public void restructure() {
		int temp[] = coefficient;
		coefficient = new int[coefficient.length*2];
		for(int i = 0; i<temp.length; i++) {
			coefficient[i] = temp[i];
		}
	}
	
	public void add(PolynomialClass p2) {
		 int i = 0, j = 0, k = 0;
		 while(i<this.coefficient.length && j<p2.coefficient.length) {
			 this.setCoefficient(k, this.coefficient[i]+p2.coefficient[j]);
			 i++; k++; j++;
		 }
		 
		 while(i<this.coefficient.length) {
			 this.setCoefficient(k, this.coefficient[i]);
			 i++; k++;
		 }
		 
		 while(j<p2.coefficient.length) {
			 this.setCoefficient(k, p2.coefficient[i]);
			 j++; k++;
		 }
	}
	
	public static PolynomialClass add(PolynomialClass p1, PolynomialClass p2) {
		
		PolynomialClass p = new PolynomialClass();
		int i = 0, j = 0, k = 0;
		while(i<p1.coefficient.length && j<p2.coefficient.length) {
			p.setCoefficient(k, p1.coefficient[i]+p2.coefficient[j]);
			i++; k++; j++;
		}
		 
		while(i<p1.coefficient.length) {
			p.setCoefficient(k, p1.coefficient[i]);
			i++; k++;
		}
		 
		while(j<p2.coefficient.length) {
			p.setCoefficient(k, p2.coefficient[i]);
			j++; k++;
		}
		return p;
	}
	
	public void Subtract(PolynomialClass p2) {
		 int i = 0, j = 0, k = 0;
		 while(i<this.coefficient.length && j<p2.coefficient.length) {
			 this.setCoefficient(k, this.coefficient[i]-p2.coefficient[j]);
			 i++; k++; j++;
		 }
		 
		 while(i<this.coefficient.length) {
			 this.setCoefficient(k, this.coefficient[i]);
			 i++; k++;
		 }
		 
		 while(j<p2.coefficient.length) {
			 this.setCoefficient(k, p2.coefficient[i]);
			 j++; k++;
		 }
	}
	
	public PolynomialClass Subtract(PolynomialClass p1, PolynomialClass p2) {
		
		PolynomialClass p = new PolynomialClass();
		int i = 0, j = 0, k = 0;
		while(i<p1.coefficient.length && j<p2.coefficient.length) {
			p.setCoefficient(k, p1.coefficient[i]-p2.coefficient[j]);
			i++; k++; j++;
		}
		 
		while(i<p1.coefficient.length) {
			p.setCoefficient(k, p1.coefficient[i]);
			i++; k++;
		}
		 
		while(j<p2.coefficient.length) {
			p.setCoefficient(k, p2.coefficient[i]);
			j++; k++;
		}
		return p;
	}
	
	public PolynomialClass Multiplication(PolynomialClass p1, PolynomialClass p2) {
		PolynomialClass p = new PolynomialClass();
		
		for(int i = 0; i<p1.coefficient.length; i++) {
			for(int j = 0; j<p2.coefficient.length; j++) {
				if(i+j <= p1.degree) {
					p.setCoefficient(i+j, p.coefficient[i+j]+p1.coefficient[i]*p2.coefficient[j]);
				}
				else {
					p.setCoefficient(i+j, p1.coefficient[i]*p2.coefficient[j]);
				}
			}
		}
		return p;
	}
	
	public int evaluate(int val) {
		int ans = 0;
		for(int i = 0; i< this.coefficient.length; i++) {
			ans = (int) ((ans) + ((coefficient[i])*(Math.pow(val, i))));
		}
		return ans;
	}
	
	public void print() {
		for(int i = coefficient.length -1 ;i>=0; i--) {
			if(coefficient[i] != 0) {
				System.out.print(coefficient[i]+"x^"+i+"+ ");
			}
		}
		System.out.println();
	}
	
}
