package AbstractClassesAndFunc;

//now as this class is inherting from vehicle which is a abstract class so it should complete the abstract function otherwise it has to declare itself as abstract
public class Car2 extends Vehicle2{
	
	String name;
	
	public Car2(String name, String color, int maxSpeed) {
		super(color, maxSpeed);
		this.name= name;
	}

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void Display() {
		super.print();
		System.out.print("Name: "+ name);
		
	}
}
