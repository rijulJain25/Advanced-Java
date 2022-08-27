package Inheritance;

public class Vehicle {
//	Deafault or friendly access modifier here the variable is only visible or accessible inside the package only
	String color;
//	private AccessModifiers cannot be accessed outside the class
	private int maxSpeed;
//  protected access modifiers can be accessed outside the package protectively
//	private>friendly>protected>public
	
	public Vehicle(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//it can be accessed all over the file
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle color: " + color);
		System.out.println("Vehicle Speed: " + maxSpeed);
	}
}
