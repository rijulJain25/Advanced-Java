package Inheritance;

public class CarVehicle extends Vehicle{
	private String name;
	private int numGears;
	
//	we are using super keyword for justifying the parameters of base class
	public CarVehicle(String name, int numGears, String color, int maxSpeed) {
		super(color, maxSpeed);
		this.name = name;
		this.numGears = numGears;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumGears(int gears) {
		this.numGears = gears;
	}
	
	public void print() {
//		this keyword will first call the print function of base class and the body of this function will be printed
		super.print();
		System.out.println("Name: "+ name+"\n"+"No. of Gears: "+numGears);
	}
	
}