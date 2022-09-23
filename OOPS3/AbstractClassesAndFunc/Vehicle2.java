package AbstractClassesAndFunc;

public abstract class Vehicle2 {
	
	private String color;
	int maxSpeed;
	
	public Vehicle2(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public abstract boolean isMotorized();
	
	public final void print() {
		System.out.print("Color: "+color);
		System.out.print("Maximum Speed: "+maxSpeed);
	}
	
}
